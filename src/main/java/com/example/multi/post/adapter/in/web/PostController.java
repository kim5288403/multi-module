package com.example.multi.post.adapter.in.web;

import com.example.multi.post.adapter.in.web.request.WriteRequest;
import com.example.multi.post.appilcation.port.in.PostUseCase;
import com.example.multi.post.domain.model.Post;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostUseCase postUseCase;

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public Post detail(@PathVariable Long id) {
        return postUseCase.detail(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "")
    public Post write(@Valid WriteRequest writeRequest) {
        return postUseCase.write(writeRequest.getContent());
    }
}
