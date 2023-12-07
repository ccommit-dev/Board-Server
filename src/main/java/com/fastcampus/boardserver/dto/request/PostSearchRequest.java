package com.fastcampus.boardserver.dto.request;

import com.fastcampus.boardserver.dto.SortStatus;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PostSearchRequest {
    private int id;
    private String name;
    private String contents;
    private int views;
    private int categoryId;
    private int userId;
    private SortStatus sortStatus;
    private String tagName;
}
