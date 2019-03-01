package com.indevopslab.springit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indevopslab.springit.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);

}
