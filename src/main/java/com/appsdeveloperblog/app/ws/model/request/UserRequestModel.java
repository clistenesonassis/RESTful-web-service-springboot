package com.appsdeveloperblog.app.ws.model.request;

import lombok.Data;

@Data
public class UserRequestModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
