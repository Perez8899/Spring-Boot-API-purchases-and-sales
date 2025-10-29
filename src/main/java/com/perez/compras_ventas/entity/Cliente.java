package com.perez.compras_ventas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clien")
    private Integer idClien;

    private String tipo;

     @Column(name = "razon_social", length = 100)
    private String razonSocial;

    @Column(name = "nro_identificacion", length = 100)
    private String nroIdentificacion;

    private String telefono;

     @Column(name = "direccion", columnDefinition = "TEXT")
    private String direccion;

    private String correo;

    private Boolean estado;
    
}
