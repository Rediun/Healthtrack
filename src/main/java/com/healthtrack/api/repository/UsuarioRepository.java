package com.healthtrack.api.repository;

import com.healthtrack.api.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    // Aquí podrías agregar métodos de búsqueda custom, ej:
    // List<Usuario> findByRol(String rol);
}