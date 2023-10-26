package com.example.multi.post.appilcation.port.in;

import com.example.multi.post.domain.model.Post;

public interface PostUseCase {
    Post detail(Long id);
    Post write(String content);
}
