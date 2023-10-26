package com.example.multi_module.post.adapter.out.persistence.repository;

import com.example.multi_module.post.adapter.out.persistence.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long>, PostQueryDslRepository {
}