package com.example.BlogProject.controller;

import com.example.BlogProject.model.Post;
import com.example.BlogProject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PostController {
    @Autowired
private PostService service;
@GetMapping("/posts")
    public List<Post> getAllPosts()
{
    return service.getAllPosts();
}
@GetMapping("/posts/{id}")
    public Optional<Post> getPostById(@PathVariable Long id)
{
    return service.getPostById(id);
}
    @PostMapping("/posts")
    public void createPost(@RequestBody Post post)
{
     service.savePost(post);
}

}
