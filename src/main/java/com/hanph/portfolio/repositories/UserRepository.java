package com.hanph.portfolio.repositories;

import com.hanph.portfolio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}