package com.miaoshaproject.service.inpl;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserserviceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;
    @Override
    public void getUserById(Integer id) {


    }
}
