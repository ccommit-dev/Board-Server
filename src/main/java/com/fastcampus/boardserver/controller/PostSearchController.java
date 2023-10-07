package com.fastcampus.boardserver.controller;

import com.fastcampus.boardserver.dto.CategoryDTO;
import com.fastcampus.boardserver.dto.PostDTO;
import com.fastcampus.boardserver.service.impl.PostSearchServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
@Log4j2
@RequiredArgsConstructor
public class PostSearchController {

    private final PostSearchServiceImpl postSearchService;

    @GetMapping
    public PostSearchResponse search(PostDTO postDTO, CategoryDTO categoryDTO) {
        List<PostDTO> postDTOList = postSearchService.getProducts(postDTO,categoryDTO);
        return new PostSearchResponse(postDTOList);
    }

    // -------------- response 객체 --------------

    @Getter
    @AllArgsConstructor
    private static class PostSearchResponse {
        private List<PostDTO> postDTOList;
    }
}
