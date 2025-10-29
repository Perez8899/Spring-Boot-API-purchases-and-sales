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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suc")
    private Integer idSuc;

    private String nombre;

    @Column(name = "direccion", columnDefinition = "TEXT")
    private String direccion;

    private String telefono;
    

    @OneToMany(mappedBy = "sucursal")
private List<Almacen> almacenes = new ArrayList<>();

@OneToMany(mappedBy = "sucursal")
private List<RolSucursal> rolesSucursales = new ArrayList<>();
}
