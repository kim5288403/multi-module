package com.example.multi.post;

import com.example.multi.post.appilcation.port.out.PostOutPort;
import com.example.multi.post.appilcation.service.PostService;
import com.example.multi.post.domain.model.Post;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class PostServiceTest {
    @InjectMocks
    private PostService postService;
    @Mock
    private PostOutPort postOutPort;

    @Test
    public void givenValidContent_whenWrite_thenReturnSavedPost() {
        // given
        String content = "content";
        Post post = Post.create(content);
        given(postOutPort.save(any(Post.class))).willReturn(post);

        // when
        Post result = postService.write(content);

        // then
        assertNotNull(result);
        assertEquals(content, result.getContent());
        verify(postOutPort, times(1)).save(any(Post.class));
    }

    @Test
    public void givenValidPostId_whenDetail_thenReturnFoundPost() {
        // given
        String content = "content";
        Post post = Post.create(content);
        Long postId = post.getPostId();
        given(postOutPort.load(anyLong())).willReturn(post);

        // when
        Post result = postService.detail(postId);

        // then
        assertNotNull(result);
        assertEquals(content, result.getContent());
        verify(postOutPort, times(1)).load(anyLong());
    }
}
