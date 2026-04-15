package se.andaluscalendar.backend.controller;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.andaluscalendar.backend.repository.UserRepository;
import se.andaluscalendar.backend.security.JwtUtils;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtil;
}
