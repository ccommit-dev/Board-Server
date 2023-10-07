package com.fastcampus.boardserver.service;


import com.fastcampus.boardserver.dto.CategoryDTO;
import com.fastcampus.boardserver.dto.PostDTO;

import java.util.List;

public interface PostSearchService {
    List<PostDTO> getProducts(PostDTO productDTO, CategoryDTO categoryDTO);
}
