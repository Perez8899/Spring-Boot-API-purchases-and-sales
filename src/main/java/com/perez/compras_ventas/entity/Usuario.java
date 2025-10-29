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
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_usu")
    private Integer idUsu;

    private String nombre;
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fecha_nacimiento;

    private String telefono;
    private String direccion;

    @Column(nullable = false, unique = true, length = 20)
    private String dni;

    @Column(name = "username", length = 20, unique = true)
    private String userName;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    private String password;


@OneToMany(mappedBy = "usuario")
private List<Nota> notas = new ArrayList<>();

@OneToMany(mappedBy = "usuario")
private List<UsuarioRol> usuarioRoles = new ArrayList<>();

}
