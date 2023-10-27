package org.example.repository;


import org.example.entity.PostEntity;

public interface PostQueryDslRepository {
    PostEntity findByPostId(Long postId);
}
