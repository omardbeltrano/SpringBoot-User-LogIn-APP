package com.app.user.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.user.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
