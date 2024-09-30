package com.example.BlogProject.repo;

import com.example.BlogProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>
{

}

