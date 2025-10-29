package com.perez.compras_ventas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perez.compras_ventas.repository.PermisoRepository;
import com.perez.compras_ventas.response.PermisoResponse;

@Service
public class PermisoServiceImpl implements PermisoService {

    @Autowired
    private PermisoRepository permisoRepository;

    @Override
    public List<PermisoResponse> findAllPermiso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllPermiso'");
    }

    @Override
    public PermisoResponse findPermisoById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPermisoById'");
    }

    @Override
    public PermisoResponse createPermiso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPermiso'");
    }

    @Override
    public PermisoResponse updatePermiso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePermiso'");
    }

    @Override
    public PermisoResponse deletePermiso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePermiso'");
    }

}
