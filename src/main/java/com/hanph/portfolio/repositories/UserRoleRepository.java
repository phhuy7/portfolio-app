package com.hanph.portfolio.repositories;

import com.hanph.portfolio.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}