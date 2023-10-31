package org.example.mapper;


import org.example.domain.model.Post;
import org.example.entity.PostEntity;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PostMapper {

    Post toDomain(PostEntity postEntity);
    PostEntity toEntity(Post post);
}
