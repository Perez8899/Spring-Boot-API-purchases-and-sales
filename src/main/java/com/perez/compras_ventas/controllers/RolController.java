package com.perez.compras_ventas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perez.compras_ventas.entity.Rol;
import com.perez.compras_ventas.services.RolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> finAllRoles() {
        return rolService.findAllRoles();
    }

    @GetMapping("/{id}")
    public Rol findRolById(@PathVariable Integer id) {
        return rolService.findRolById(id);
    }

    @PostMapping()
    public Rol createRol(@RequestBody Rol rol) {
        return rolService.createRol(rol);
    }

    @PutMapping()
    public Rol updateRol(@RequestBody Rol rol) {
        return rolService.updateRol(rol);
    }

    public void deleteRol(@PathVariable Integer id) {
        rolService.deleteRol(id);
    }
}
