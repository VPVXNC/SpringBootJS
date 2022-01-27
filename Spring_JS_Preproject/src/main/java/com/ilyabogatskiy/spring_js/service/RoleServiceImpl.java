package com.ilyabogatskiy.spring_js.service;

import com.ilyabogatskiy.spring_js.model.Role;
import com.ilyabogatskiy.spring_js.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl (RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Set<Role> getAllRoles() {
        Iterable<Role>  iterable = roleRepository.findAll();
        Set<Role> set = new HashSet<>();
        iterable.forEach(set::add);
        return set;
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
