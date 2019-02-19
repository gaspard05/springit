package com.indevopslab.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indevopslab.springit.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
