package com.ilyabogatskiy.spring_js.service;

import com.ilyabogatskiy.spring_js.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByName(String name);
    Role save(Role role);
}