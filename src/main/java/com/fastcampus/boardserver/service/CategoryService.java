package com.fastcampus.boardserver.service;


import com.fastcampus.boardserver.dto.CategoryDTO;

public interface CategoryService {

    void register(String accountId, CategoryDTO categoryDTO);

    void update(CategoryDTO categoryDTO);

    void delete(int categoryId);
}
