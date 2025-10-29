package com.perez.compras_ventas.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermisoRequest {  //input data
    
    private String nombre;
    private String descripcion;
    private String recurso;
    private String accion;
}
