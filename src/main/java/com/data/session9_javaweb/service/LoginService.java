package com.data.session9_javaweb.service;

import com.data.session9_javaweb.model.Customer;

public interface LoginService {
    Customer login(String username, String password);
}
