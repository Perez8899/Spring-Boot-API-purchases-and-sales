package com.perez.compras_ventas.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_usu")
    private Integer idUsu;

    @Column(nullable = false,length = 100)
    private String nombre;

    @Column(nullable = false,length = 100)
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(length = 50)
    private String telefono;

    private String direccion;

    @Column(nullable = false, unique = true, length = 20)
    private String dni;

    @Column(name = "username", length = 20, unique = true)
    private String userName;

    @Column(nullable = false, length = 100, unique = true)
    private String correo;

     @Column(nullable = false)
    private String password;


// @OneToMany(mappedBy = "usuario")
// private List<Nota> notas = new ArrayList<>();

// @OneToMany(mappedBy = "usuario")
// private List<UsuarioRol> usuarioRoles = new ArrayList<>();

}
