package com.perez.compras_ventas.dto.request;

import java.time.LocalDate;

import com.perez.compras_ventas.entity.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioRequest {
    
    private String nombre;

    private String apellido;

    private String fechaNacimiento;

    private String telefono;

    private String direccion;

    private String dni;

    private String correo;

    public static Usuario toEntity(UsuarioRequest usuarioRequest){
        return Usuario.builder()
               .nombre(usuarioRequest.getNombre())
               .apellido(usuarioRequest.getApellido())
               .fechaNacimiento(LocalDate.parse(usuarioRequest.getFechaNacimiento()))
               .telefono(usuarioRequest.getTelefono())
               .direccion(usuarioRequest.getDireccion())
               .dni(usuarioRequest.getDni())
               .correo(usuarioRequest.getCorreo())
               .build();
    }

}
