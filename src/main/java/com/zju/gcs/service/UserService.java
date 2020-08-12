package com.zju.gcs.service;

import com.zju.gcs.model.UserDO;
import com.zju.gcs.vo.LoginVO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public interface UserService {
    UserDO getUser(LoginVO loginVO, HttpServletRequest request);

    void addUser(UserDO userDO);
}
