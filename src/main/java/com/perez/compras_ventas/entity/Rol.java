package com.perez.compras_ventas.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rol {  // 1

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_rol")
    private Integer idRol;

    @Column(nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;


    @OneToMany(mappedBy = "rol")
private List<PermisoRol> permisosRoles = new ArrayList<>();

@OneToMany(mappedBy = "rol")
private List<UsuarioRol> usuariosRoles = new ArrayList<>();

@OneToMany(mappedBy = "rol")
private List<RolSucursal> rolesSucursales = new ArrayList<>();
}
