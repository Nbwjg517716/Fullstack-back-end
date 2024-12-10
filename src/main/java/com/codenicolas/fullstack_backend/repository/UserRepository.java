package com.codenicolas.fullstack_backend.repository;

import com.codenicolas.fullstack_backend.repository.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
