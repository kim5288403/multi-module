package org.example.service;

import org.example.domain.model.Post;
import org.example.port.in.PostUseCase;
import org.example.port.out.PostOutPort;

public class PostService implements PostUseCase {

    private final PostOutPort postOutPort;

    public PostService(PostOutPort postOutPort) {
        this.postOutPort = postOutPort;
    }

    @Override
    public Post write(String content) {
        Post post = Post.create(content);
        return postOutPort.save(post);
    }

    @Override
    public Post detail(Long postId) {
        return postOutPort.load(postId);
    }
}
