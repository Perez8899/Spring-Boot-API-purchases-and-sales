package com.perez.compras_ventas.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mov")
    private Integer idMov;

    private Integer cantidad;

     @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

     @Column(name = "observacion", columnDefinition = "TEXT")
    private String observacion;

    @Column(name = "tipo_movimiento", length = 20)
    private String tipoMovimiento;

   @ManyToOne
    @JoinColumn(name = "id_nota")
    private Nota nota;
    
    @ManyToOne
    @JoinColumn(name = "id_prod")
    private Producto producto;
    
    @ManyToOne
    @JoinColumn(name = "id_alm")
    private Almacen almacen;
}
