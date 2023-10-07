package gofit.auth.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController //controller not detect on swagger 
public class AuthController {


    @PostMapping("/login")
    public String login(){
        return "Berhasil login";
    }

    @PostMapping("/register")
    public String register(){
        return "Berhasil register";
    }
}
