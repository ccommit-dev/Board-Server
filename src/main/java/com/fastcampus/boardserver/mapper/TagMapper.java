package com.fastcampus.boardserver.mapper;

import com.fastcampus.boardserver.dto.TagDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagMapper {
    public int register(TagDTO tagDTO);

    public void updateTags(TagDTO tagDTO);

    public void deletePostTag(int tagId);

    public void createPostTag(Integer tagId, Integer postId);

}
