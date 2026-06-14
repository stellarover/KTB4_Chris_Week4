package chris.week4.controller;

import chris.week4.domain.Post;
import chris.week4.dto.PostCreateRequest;
import chris.week4.dto.PostUpdateRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {

        return List.of(
                new Post(
                        1L,
                        "첫 번째 게시글",
                        "안녕하세요.",
                        "Chris"
                ),
                new Post(
                        2L,
                        "두 번째 게시글",
                        "Spring Boot 공부중",
                        "Subin"
                )
        );
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {

        return new Post(
                id,
                "첫 번째 게시글",
                "안녕하세요.",
                "Chris"
        );
    }

    @PostMapping("/posts")
    public String createPost(@RequestBody PostCreateRequest request) {

        return "게시글 작성 성공";
    }

    @PatchMapping("/posts/{id}")
    public String updatePost(
            @PathVariable Long id,
            @RequestBody PostUpdateRequest request
    ) {

        return "게시글 수정 성공";
    }

    @DeleteMapping("/posts/{id}")
    public String deletePost(@PathVariable Long id) {

        return "게시글 삭제 성공";
    }
}