package com.healthtrack.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data // Esto (de Lombok) crea getters, setters, toString, etc.
@Document(collection = "usuarios") // Le dice a Mongo en qué colección guardar
public class Usuario {

    @Id
    private String id; // MongoDB usa String para los _id
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private Date fecha_nacimiento;
    private String telefono;
    private String rol; // "paciente" o "doctor"

    // Campos específicos de doctor
    private String especialidad;
    private String cedula_profesional;
    private List<Horario> horarios_disponibles;

    // Clase interna para el subdocumento de horarios
    @Data
    static class Horario {
        private int dia_semana;
        private String inicio;
        private String fin;
    }
}