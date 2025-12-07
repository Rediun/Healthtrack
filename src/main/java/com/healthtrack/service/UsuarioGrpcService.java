package com.healthtrack.service;

import com.healthtrack.grpc.*;
import com.healthtrack.api.repository.UsuarioRepository; 
import com.healthtrack.api.model.Usuario;             
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@GrpcService
public class UsuarioGrpcService extends UsuarioServiceGrpc.UsuarioServiceImplBase {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void crearUsuario(UsuarioRequest request, StreamObserver<UsuarioResponse> responseObserver) {
        Usuario usuario = new Usuario();
        // Nota: No seteamos ID porque Mongo lo genera
        usuario.setNombre(request.getNombre());
        usuario.setApellido(request.getApellido());
        usuario.setEmail(request.getEmail());
        usuario.setRol(request.getRol());
        usuario.setTelefono(request.getTelefono());
        
        if ("DOCTOR".equalsIgnoreCase(request.getRol())) {
            usuario.setEspecialidad(request.getEspecialidad());
        }

        Usuario guardado = usuarioRepository.save(usuario);

        UsuarioResponse response = UsuarioResponse.newBuilder()
                .setId(guardado.getId())
                .setNombre(guardado.getNombre())
                .setApellido(guardado.getApellido() != null ? guardado.getApellido() : "")
                .setEmail(guardado.getEmail())
                .setRol(guardado.getRol() != null ? guardado.getRol() : "")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void obtenerUsuario(UsuarioIdRequest request, StreamObserver<UsuarioResponse> responseObserver) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(request.getId());

        if (usuarioOpt.isPresent()) {
            Usuario u = usuarioOpt.get();
            UsuarioResponse response = UsuarioResponse.newBuilder()
                    .setId(u.getId())
                    .setNombre(u.getNombre())
                    .setApellido(u.getApellido() != null ? u.getApellido() : "")
                    .setEmail(u.getEmail())
                    .setRol(u.getRol() != null ? u.getRol() : "")
                    .build();
            responseObserver.onNext(response);
        } else {
             responseObserver.onError(new RuntimeException("Usuario no encontrado"));
             return;
        }
        responseObserver.onCompleted();
    }

    @Override
    public void eliminarUsuario(UsuarioIdRequest request, StreamObserver<Empty> responseObserver) {
        if (usuarioRepository.existsById(request.getId())) {
            usuarioRepository.deleteById(request.getId());
            responseObserver.onNext(Empty.newBuilder().build());
        } else {
            responseObserver.onError(new RuntimeException("ID no existe"));
            return;
        }
        responseObserver.onCompleted();
    }
}