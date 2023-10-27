package org.example.port.out;

import org.example.domain.model.Post;

public interface PostOutPort {
    Post load(Long postId);
    Post save(Post post);
}
