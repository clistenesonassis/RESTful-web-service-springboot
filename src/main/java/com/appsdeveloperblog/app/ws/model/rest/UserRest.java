package com.appsdeveloperblog.app.ws.model.rest;

import lombok.Data;

@Data
public class UserRest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
