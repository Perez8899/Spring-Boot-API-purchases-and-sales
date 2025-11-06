package com.perez.compras_ventas.auth;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class JwtService {

    @Value("${application.security.jwt.secret-key}")
    private String secretKey;

    @Value("${application.security.jwt.expiration}")
    private Long jwtExpiration;

    @Value("${application.security.jwt.refresh.expiration}")
    private Long refreshExpiration;


    //extract userName
    public String extractUserName(String token) {
        return Jwts.parser()
                .verifyWith(getSignKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    //generate Token

    //generate Refresh Token
    //build token
    // isTokenValid
    //isTokenExpired

    private SecretKey getSignKey() {
        final byte[] keyBites = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBites);
    }
}

