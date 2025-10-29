package com.perez.compras_ventas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "almacen")
public class Almacen {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alm")
    private Integer idAlm;

    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;
   
    @Column(name = "codigo", length = 20)
    private String codigo;

    // Relación con AlmacenProducto
    @OneToMany(mappedBy = "almacen", cascade = CascadeType.ALL)
    private List<AlmacenProducto> productosAlmacen = new ArrayList<>();

}