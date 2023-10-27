package org.example.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
public class Post {
    private Long postId;

    private String content;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    public static Post create(
            String content
    ) {
        Long postId = ZonedDateTime.now().toEpochSecond();
        return new Post(postId, content, LocalDateTime.now(), LocalDateTime.now());
    }
}
