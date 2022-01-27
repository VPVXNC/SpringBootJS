package com.ilyabogatskiy.spring_js.controller;

import com.ilyabogatskiy.spring_js.model.User;
import com.ilyabogatskiy.spring_js.service.RoleService;
import com.ilyabogatskiy.spring_js.service.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserService userService;
    private final RoleService roleService;

    public UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping(value = "/admin")
    public String showAllUsers(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("roles", roleService.getAllRoles());
        model.addAttribute("user", user);
        return "admin_page";
    }

    @GetMapping(value = "/user")
    public String userInfo(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        model.addAttribute("roles", user.getRoles());
        return "user_page";
    }
}
