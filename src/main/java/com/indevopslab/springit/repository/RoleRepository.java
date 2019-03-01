package com.indevopslab.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indevopslab.springit.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
