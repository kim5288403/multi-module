package com.example.multi.post.appilcation.service;

import com.example.multi.post.appilcation.port.in.PostUseCase;
import com.example.multi.post.appilcation.port.out.PostOutPort;
import com.example.multi.post.domain.model.Post;

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
