package com.BE.model.request;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PACKAGE)
public class LoginGoogleRequest {
    String token;
}
