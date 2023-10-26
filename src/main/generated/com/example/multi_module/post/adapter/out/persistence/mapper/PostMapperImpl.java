package com.example.multi_module.post.adapter.out.persistence.mapper;

import com.example.multi_module.post.adapter.out.persistence.entity.PostEntity;
import com.example.multi_module.post.domain.model.Post;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-26T14:40:22+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.3.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post toDomain(PostEntity postEntity) {
        if ( postEntity == null ) {
            return null;
        }

        Long postId = null;
        String content = null;
        LocalDateTime createdDate = null;
        LocalDateTime updatedDate = null;

        postId = postEntity.getPostId();
        content = postEntity.getContent();
        createdDate = postEntity.getCreatedDate();
        updatedDate = postEntity.getUpdatedDate();

        Post post = new Post( postId, content, createdDate, updatedDate );

        return post;
    }

    @Override
    public PostEntity toEntity(Post post) {
        if ( post == null ) {
            return null;
        }

        PostEntity.PostEntityBuilder postEntity = PostEntity.builder();

        postEntity.postId( post.getPostId() );
        postEntity.content( post.getContent() );
        postEntity.createdDate( post.getCreatedDate() );
        postEntity.updatedDate( post.getUpdatedDate() );

        return postEntity.build();
    }
}
