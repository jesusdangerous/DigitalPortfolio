package com.vagonka.DigitalPortfolioSystem.services.authentication;

import com.vagonka.DigitalPortfolioSystem.dto.SignupRequestDTO;
import com.vagonka.DigitalPortfolioSystem.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);

    UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
