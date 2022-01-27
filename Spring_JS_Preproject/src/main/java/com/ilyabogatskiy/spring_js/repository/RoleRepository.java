package com.ilyabogatskiy.spring_js.repository;

import com.ilyabogatskiy.spring_js.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role getRoleByName(String name);
    Role save(Role role);
}