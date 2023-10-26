package com.example.multi_module.post.appilcation.port.in;

import com.example.multi_module.post.domain.model.Post;

public interface PostUseCase {
    Post detail(Long id);
    Post write(String content);
}
