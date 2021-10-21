package com.appsdeveloperblog.app.ws.model.service;

import com.appsdeveloperblog.app.ws.shared.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    UserDTO createUser(UserDTO user);
}
