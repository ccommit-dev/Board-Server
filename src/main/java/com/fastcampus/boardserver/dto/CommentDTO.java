package com.fastcampus.boardserver.dto;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private int id;
    private int postId;
    private String contents;
    private int subCommentId;
}
