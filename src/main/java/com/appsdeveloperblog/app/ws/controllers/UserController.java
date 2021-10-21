package com.appsdeveloperblog.app.ws.controllers;

import com.appsdeveloperblog.app.ws.model.request.UserRequestModel;
import com.appsdeveloperblog.app.ws.model.rest.UserRest;
import com.appsdeveloperblog.app.ws.model.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "get user was called.";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserRequestModel userResquest) {
        UserRest returnValue = new UserRest();

        UserDTO user = new UserDTO();
        BeanUtils.copyProperties(userResquest, user);

        UserDTO userCreated = userService.createUser(user);
        BeanUtils.copyProperties(userCreated, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete uder was called";
    }
}
