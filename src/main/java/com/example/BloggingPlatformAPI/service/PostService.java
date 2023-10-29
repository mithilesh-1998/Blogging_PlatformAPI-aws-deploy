package com.example.BloggingPlatformAPI.service;

import com.example.BloggingPlatformAPI.model.Post;
import com.example.BloggingPlatformAPI.model.User;
import com.example.BloggingPlatformAPI.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    public String createBlogPost(Post post) {
        postRepo.save(post);
        return "Post uploaded!!!!";
    }

    public String removeBlogPost(Integer postId, User user) {
        Post post  = postRepo.findById(postId).orElse(null);
        if(post != null && post.getPostOwner().equals(user))
        {
            postRepo.deleteById(postId);
            return "Removed successfully";
        }
        else if (post == null)
        {
            return "Post to be deleted does not exist";
        }
        else{
            return "Un-Authorized delete detected....Not allowed";
        }
    }

    public boolean validatePost(Post blogPost) {
        return (blogPost!=null && postRepo.existsById(blogPost.getPostId()));
    }

    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    public Optional<Post> getPostById(Integer postId) {
        return postRepo.findById(postId);
    }
}
