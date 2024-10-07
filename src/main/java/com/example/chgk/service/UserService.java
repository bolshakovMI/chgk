package com.example.chgk.service;

import com.example.chgk.model.dto.request.URequest;
import com.example.chgk.model.dto.response.UserResponse;
import com.example.chgk.model.dto.request.AuthorityRequest;
import com.example.chgk.model.dto.response.AuthorityResponse;
import com.example.chgk.model.dto.response.JwtAuthenticationResponse;
import com.example.chgk.model.db.entity.User;
import com.example.chgk.model.dto.request.UserRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import java.util.List;

public interface UserService {
    Page<UserResponse> getAllUsers(Integer page, Integer perPage, String sort, Sort.Direction order);
    User getUser(String user);
    UserResponse getUserResponse(String user);
    JwtAuthenticationResponse createUser(URequest request);
    String updatePassword(UserRequest request);
    AuthorityResponse updateAuthority (AuthorityRequest request);
    AuthorityResponse addAuthority (String username, List <String> newAuthority);
    AuthorityResponse  deleteAuthority (String username, List <String> newAuthority);
    String setEnable(String username, boolean isEnable);
}
