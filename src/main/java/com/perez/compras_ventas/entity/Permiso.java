package com.perez.compras_ventas.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permiso")
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_per")
    private Integer idPer;
    
    @Column(name = "per_nombre", nullable= false, length = 50)
    private String nombre;
    
    @Column(name = "per_descripcion", length = 100)
    private String descripcion;
    
    @Column(name = "per_recurso", length = 100)
    private String recurso;
    
    @Column(name = "per_accion", length = 100)
    private String accion;
    

//     @OneToMany(mappedBy = "permiso")
// private List<PermisoRol> permisosRoles = new ArrayList<>();

// @OneToMany(mappedBy = "permiso")
// private List<RolSucursal> rolesSucursales = new ArrayList<>();
}
