package com.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
