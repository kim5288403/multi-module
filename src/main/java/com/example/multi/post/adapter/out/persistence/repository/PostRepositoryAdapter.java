package com.example.multi.post.adapter.out.persistence.repository;

import com.example.multi.post.adapter.out.persistence.entity.PostEntity;
import com.example.multi.post.adapter.out.persistence.mapper.PostMapper;
import com.example.multi.post.appilcation.port.out.PostOutPort;
import com.example.multi.post.domain.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostRepositoryAdapter implements PostOutPort {

    private final PostMapper postMapper;
    private final PostRepository postRepository;

    @Override
    public Post save(Post post) {
        PostEntity postEntity = postRepository.save(postMapper.toEntity(post));

        return postMapper.toDomain(postEntity);
    }

    @Override
    public Post load(Long postId) {
        PostEntity postEntity = postRepository.findByPostId(postId);

        return postMapper.toDomain(postEntity);
    }
}
