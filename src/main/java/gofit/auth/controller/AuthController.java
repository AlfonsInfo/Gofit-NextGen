package gofit.auth.controller;


import gofit.auth.dto.LoginRequest;
import gofit.auth.dto.LoginResponse;
import gofit.auth.dto.RegisterRequest;
import gofit.auth.dto.RegisterResponse;
import gofit.auth.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController //controller not detect on swagger
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/login")
    public LoginResponse login(HttpServletRequest httpServletRequest, @RequestBody LoginRequest request){
        return LoginResponse.builder().build();
    }

    @PostMapping("/register-mobile")
    public RegisterResponse register(HttpServletRequest httpServletRequest, @RequestBody RegisterRequest request){


        return authService.registerEmailMobile(request);
    }
}
