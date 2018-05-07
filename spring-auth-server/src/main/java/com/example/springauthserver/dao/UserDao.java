package com.example.springauthserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springauthserver.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
