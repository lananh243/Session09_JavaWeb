package com.data.session9_javaweb.repository;

import com.data.session9_javaweb.model.Customer;

public interface LoginRepository {
    Customer login(String username,String password);
}
