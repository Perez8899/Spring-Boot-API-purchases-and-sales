package com.perez.compras_ventas.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.perez.compras_ventas.entity.Usuario;


public interface UsuarioRepository extends ListCrudRepository<Usuario, Integer>{
    
}
