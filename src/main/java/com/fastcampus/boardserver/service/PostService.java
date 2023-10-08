package com.fastcampus.boardserver.service;


import com.fastcampus.boardserver.dto.CommentDTO;
import com.fastcampus.boardserver.dto.PostDTO;

import java.util.List;

public interface PostService {

    void register(String id, PostDTO postDTO);

    List<PostDTO> getMyProducts(int accountId);

    void updateProducts(PostDTO postDTO);

    void deleteProduct(int userId, int productId);

    void registerComment(CommentDTO commentDTO);

    void updateComment(CommentDTO commentDTO);

    void deletePostComment(int userId, int commentId);
}
