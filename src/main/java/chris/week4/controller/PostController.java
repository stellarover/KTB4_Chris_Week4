package chris.week4.controller;

import chris.week4.domain.Post;
import chris.week4.dto.PostCreateRequest;
import chris.week4.dto.PostUpdateRequest;
import chris.week4.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
    }

    @PostMapping("/posts")
    public String createPost(@RequestBody PostCreateRequest request) {
        return "게시글 작성 성공";
    }

    @PatchMapping("/posts/{id}")
    public String updatePost(
            @PathVariable Long id,
            @RequestBody PostUpdateRequest request) {
        return "게시글 수정 성공";
    }

    @DeleteMapping("/posts/{id}")
    public String deletePost(@PathVariable Long id) {
        return "게시글 삭제 성공";
    }
}