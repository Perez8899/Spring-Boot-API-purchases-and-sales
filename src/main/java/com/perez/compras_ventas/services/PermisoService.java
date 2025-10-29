package com.perez.compras_ventas.services;

import java.util.List;

import com.perez.compras_ventas.response.PermisoResponse;


public interface PermisoService {

    List<PermisoResponse> findAllPermiso();

    PermisoResponse findPermisoById(Integer id);

    PermisoResponse createPermiso();

    PermisoResponse updatePermiso();

    PermisoResponse deletePermiso();
    
}
