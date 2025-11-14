package com.perez.compras_ventas.util;

import com.perez.compras_ventas.entity.Usuario;
import com.perez.compras_ventas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DataSeeder implements ApplicationRunner {  // test data

    private final UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //create data seeders
        if (usuarioRepository.count() == 0) {
            usuarioRepository.save(Usuario.builder()
                    .nombre("Usuario prueva")
                    .apellido("Perez")
                    .correo("prueba@gmail.com")
                    .direccion("direccion prueba")
                    .estado("ACTIVO")
                    .fechaNacimiento(LocalDate.now())
                    .dni("1234567")
                    .userName("perez26")
                    .telefono("12345678")
                    .password("123456")
                    .build());
        }
    }
}
