package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.config.QuerydslConfig;
import org.example.entity.PostEntity;
import org.example.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(QuerydslConfig.class)
public class PostRepositoryTest {
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private PostRepository postRepository;

    @Test
    void notNullRepository() {
        assertNotNull(postRepository);
    }

    private void settingPost(Long postId) {
        PostEntity saveData = PostEntity
                .builder()
                .postId(postId)
                .content("content")
                .build();

        postRepository.save(saveData);
    }

    @Test
    public void givenValidPostId_whenFindByPostId_thenPostIsFound() {
        // Given
        Long postId = 1L;
        settingPost(postId);

        // When
        PostEntity result = postRepository.findByPostId(postId);

        // Then
        assertNotNull(result);
        assertEquals(postId, result.getPostId());
    }
}
