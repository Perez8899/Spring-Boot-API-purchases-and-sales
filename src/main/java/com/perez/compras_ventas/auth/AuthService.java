package com.perez.compras_ventas.auth;

import com.perez.compras_ventas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private Long expiration;

    private final JwtService jwtService;

    private final UsuarioRepository usuarioRepository;

    private final AuthenticationManager authenticationManager;
}
