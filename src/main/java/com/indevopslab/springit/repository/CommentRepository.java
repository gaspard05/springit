package com.indevopslab.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indevopslab.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
