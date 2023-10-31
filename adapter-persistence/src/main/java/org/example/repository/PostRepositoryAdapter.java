package org.example.repository;

import lombok.RequiredArgsConstructor;
import org.example.domain.model.Post;
import org.example.entity.PostEntity;
import org.example.mapper.PostMapper;
import org.example.port.out.PostOutPort;
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
