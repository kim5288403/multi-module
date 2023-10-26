package com.example.multi_module.post.adapter.out.persistence.mapper;

import com.example.multi_module.post.adapter.out.persistence.entity.PostEntity;
import com.example.multi_module.post.domain.model.Post;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PostMapper {

    Post toDomain(PostEntity postEntity);
    PostEntity toEntity(Post post);
}
