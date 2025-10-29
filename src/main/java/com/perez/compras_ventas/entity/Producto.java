package com.perez.compras_ventas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prod")
    private Integer id;

    private String nombre;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "codigo_barra", length = 100)
    private String codigoBarra;
   
    private String marca;
    
    @Column(name = "precio_venta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    private String imagen;
    
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categ")
    private Categoria categoria;
    
    //Relación con AlmacenProducto
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<AlmacenProducto> almacenesProducto = new ArrayList<>();
}