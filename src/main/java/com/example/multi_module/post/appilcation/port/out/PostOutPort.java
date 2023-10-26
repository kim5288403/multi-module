package com.example.multi_module.post.appilcation.port.out;

import com.example.multi_module.post.domain.model.Post;

public interface PostOutPort {
    Post load(Long postId);
    Post save(Post post);
}
