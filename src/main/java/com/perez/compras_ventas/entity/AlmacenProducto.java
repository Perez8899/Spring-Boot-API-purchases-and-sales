package com.perez.compras_ventas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "almacen_producto")
public class AlmacenProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alm_prod")
    private Integer id;
    
    @Column(name = "stock")
    private Integer stock; 
    
    @Column(name = "fecha_actualizacion")
    private LocalDate fechaActualizacion; 
    
    @ManyToOne
    @JoinColumn(name = "id_alm")
    private Almacen almacen;
    
    @ManyToOne
    @JoinColumn(name = "id_prod") 
    private Producto producto;
}