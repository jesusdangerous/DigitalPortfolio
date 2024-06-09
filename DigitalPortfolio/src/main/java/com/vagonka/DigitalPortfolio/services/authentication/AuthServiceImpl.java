package com.vagonka.DigitalPortfolio.services.authentication;

import com.vagonka.DigitalPortfolio.dto.SignupRequestDTO;
import com.vagonka.DigitalPortfolio.dto.UserDto;
import com.vagonka.DigitalPortfolio.entity.User;
import com.vagonka.DigitalPortfolio.enums.UserRole;
import com.vagonka.DigitalPortfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserRepository userRepository;

    public UserDto signupClient(SignupRequestDTO signupRequestDTO){
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setLastname(signupRequestDTO.getLastname());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword((new BCryptPasswordEncoder().encode(signupRequestDTO.getPassword())));

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();
    }

    public Boolean presentByEmail(String email){
        return userRepository.findFirstByEmail(email)!=null;
    }

    public UserDto signupCompany(SignupRequestDTO signupRequestDTO){
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword((new BCryptPasswordEncoder().encode(signupRequestDTO.getPassword())));

        user.setRole(UserRole.COMPANY);

        return userRepository.save(user).getDto();
    }
}
