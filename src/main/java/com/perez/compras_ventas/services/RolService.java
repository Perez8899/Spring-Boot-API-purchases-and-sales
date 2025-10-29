package com.perez.compras_ventas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perez.compras_ventas.entity.Rol;
import com.perez.compras_ventas.repository.RolRepository;

@Service
public class RolService {

    // Inyeccion por Constructor--------------------------------------
    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    // METHOD---------------------------------------------------------

    public List<Rol> findAllRoles() {
        return rolRepository.findAll();
    }

    public Rol findRolById(Integer rolId) {
        return rolRepository.findById(rolId).get();
    }

    public Rol createRol(Rol rol){
        return rolRepository.save(rol);
    }

    public Rol updateRol(Rol rol){
        Rol rolRetrieved = findRolById(rol.getIdRol());
        rolRetrieved.setNombre(rol.getNombre());
        rolRetrieved.setDescripcion(rol.getDescripcion());

        return rolRepository.save(rolRetrieved);
    }

    public void deleteRol(Integer rolId){
        rolRepository.deleteById(rolId);
    }
}
