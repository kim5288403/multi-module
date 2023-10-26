package com.example.multi.post.appilcation.port.out;

import com.example.multi.post.domain.model.Post;

public interface PostOutPort {
    Post load(Long postId);
    Post save(Post post);
}
