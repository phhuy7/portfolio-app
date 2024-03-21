package com.hanph.portfolio.repositories;

import com.hanph.portfolio.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleRepository extends JpaRepository<Role, Integer> {
}