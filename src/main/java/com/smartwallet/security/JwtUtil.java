package com.smartwallet.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component//create object of Jwtutil automatically
public class JwtUtil {
//Secret key
    private static final String SECRET =
            "smartwalletsecretkeysmartwalletsecretkey123456";
     //this method convert secret string into cryptographic key
    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }

    public String generateToken(String email) {

        return Jwts.builder()
                .subject(email)//add user identity
                .issuedAt(new Date())//store token creation time
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))//Token expire Time
                .signWith(getSigningKey())//Signs Token using secret key
                .compact();//convert jwt object into String token
    }
}