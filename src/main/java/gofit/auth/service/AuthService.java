package gofit.auth.service;

import gofit.auth.dto.LoginResponse;
import gofit.auth.dto.RegisterRequest;
import gofit.auth.dto.RegisterResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {


    public LoginResponse login()
    {
        LoginResponse loginResponse = LoginResponse
                .builder()
                .build();


        return loginResponse;
    }

    @Transactional
    public RegisterResponse registerEmailMobile(RegisterRequest request)
    {


        RegisterResponse registerResponse = RegisterResponse
                .builder()
                .build();

        return registerResponse;
    }
}
