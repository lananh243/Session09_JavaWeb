package com.data.session9_javaweb.controller;

import com.data.session9_javaweb.model.Customer;
import com.data.session9_javaweb.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private LoginRepository loginRepo;

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            model.addAttribute("error", "Tên người dùng và mật khẩu không được để trống");
            return "login";
        }


        Customer customer = loginRepo.login(username, password);
        if (customer != null) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Tên người dùng hoặc mật khẩu không đúng");
            return "login";
        }

    }
}
