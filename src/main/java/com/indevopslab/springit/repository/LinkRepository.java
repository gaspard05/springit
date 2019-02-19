package com.indevopslab.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indevopslab.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {

}
