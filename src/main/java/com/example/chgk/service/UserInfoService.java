package com.example.chgk.service;

import com.example.chgk.model.db.entity.UserInfo;
import com.example.chgk.model.dto.request.UserInfoRequest;
import com.example.chgk.model.dto.response.UserInfoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface UserInfoService {
    Page<UserInfoResponse> getAllUsers(Integer page, Integer perPage, String sort, Sort.Direction order);
    UserInfoResponse getUser(Long id);
    UserInfoResponse updateUser(Long id, UserInfoRequest request);
    UserInfo getUserDb(Long id);
}
