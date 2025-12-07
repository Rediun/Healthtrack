package com.healthtrack.api.controller;

import com.healthtrack.api.model.Usuario;
import com.healthtrack.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios") // La URL base para este controlador
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // --- CREATE (Agregar) ---
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario nuevoUsuario = usuarioRepository.save(usuario);
            return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);    
        }
    }

    // --- READ (Leer Todos) ---
    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    // --- READ (Leer Uno por ID) ---
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable("id") String id) {
        return usuarioRepository.findById(id)
                .map(usuario -> new ResponseEntity<>(usuario, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // --- DELETE (Eliminar) ---
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> eliminarUsuario(@PathVariable("id") String id) {
        try {
            usuarioRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // "OK, lo borré y no hay nada que devolver"
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    // (Opcional) --- UPDATE (Actualizar) ---
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable("id") String id, @RequestBody Usuario usuarioUpdate) {
        return usuarioRepository.findById(id)
            .map(usuario -> {
                usuario.setNombre(usuarioUpdate.getNombre());
                usuario.setApellido(usuarioUpdate.getApellido());
                usuario.setEmail(usuarioUpdate.getEmail());
                usuario.setRol(usuarioUpdate.getRol());
                // ... (actualizar los demás campos que necesites)
                return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.OK);
            })
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}