package com.data.session9_javaweb.service;

import com.data.session9_javaweb.model.Customer;
import com.data.session9_javaweb.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService{
    @Autowired
    private LoginRepository loginRepo;


    @Override
    public Customer login(String username, String password) {
        return loginRepo.login(username, password);
    }
}
