package com.vagonka.DigitalPortfolio.services.authentication;

import com.vagonka.DigitalPortfolio.dto.SignupRequestDTO;
import com.vagonka.DigitalPortfolio.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);

    UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
