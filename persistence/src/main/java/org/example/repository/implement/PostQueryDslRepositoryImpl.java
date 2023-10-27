package org.example.repository.implement;

import org.example.entity.PostEntity;
import org.example.repository.PostQueryDslRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static org.example.entity.QPostEntity.postEntity;

@Repository
@RequiredArgsConstructor
public class PostQueryDslRepositoryImpl implements PostQueryDslRepository {
    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public PostEntity findByPostId(Long postId) {
        return jpaQueryFactory
                .selectFrom(postEntity)
                .where(postEntity.postId.eq(postId))
                .fetchFirst();
    }
}
