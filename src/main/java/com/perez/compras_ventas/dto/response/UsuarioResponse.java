package com.perez.compras_ventas.dto.response;

import java.time.format.DateTimeFormatter;

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
public class UsuarioResponse {
    
    private Integer idUsu;

    private String nombre;

    private String apellido;

    private String  fechaNacimiento;

    private String telefono;

    private String direccion;

    private String dni;

    private String correo;

    private String userName;

    public static UsuarioResponse fromEntity(Usuario usuario){ 
        return UsuarioResponse.builder()
        .idUsu(usuario.getIdUsu())   
        .nombre(usuario.getNombre())
        .apellido(usuario.getApellido())
        .fechaNacimiento(usuario.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
        .telefono(usuario.getTelefono())
        .direccion(usuario.getDireccion())
        .dni(usuario.getDni())
        .correo(usuario.getCorreo())
        .userName(usuario.getUserName())

        .build();
    }
}
