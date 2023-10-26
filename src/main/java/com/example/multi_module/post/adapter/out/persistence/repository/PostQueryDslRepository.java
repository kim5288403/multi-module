package com.example.multi_module.post.adapter.out.persistence.repository;

import com.example.multi_module.post.adapter.out.persistence.entity.PostEntity;

public interface PostQueryDslRepository {
    PostEntity findByPostId(Long postId);
}
