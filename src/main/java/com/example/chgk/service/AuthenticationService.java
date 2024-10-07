package com.example.chgk.service;

import com.example.chgk.model.dto.request.UserRequest;
import com.example.chgk.exceptions.CustomException;
import com.example.chgk.model.dto.response.JwtAuthenticationResponse;
import jakarta.servlet.http.HttpServletRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signIn(UserRequest request) throws CustomException;
    JwtAuthenticationResponse refreshToken(HttpServletRequest request) throws CustomException;
}
