package com.fastcampus.boardserver.mapper;

import com.fastcampus.boardserver.dto.CategoryDTO;
import com.fastcampus.boardserver.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostSearchMapper {
    public List<PostDTO> selectPosts(PostDTO productDTO, CategoryDTO categoryDTO);
}
