package com.ilyabogatskiy.spring_js.repository;

import com.ilyabogatskiy.spring_js.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}