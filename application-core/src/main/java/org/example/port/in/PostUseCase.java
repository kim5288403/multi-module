package org.example.port.in;

import org.example.domain.model.Post;

public interface PostUseCase {
    Post detail(Long id);
    Post write(String content);
}
