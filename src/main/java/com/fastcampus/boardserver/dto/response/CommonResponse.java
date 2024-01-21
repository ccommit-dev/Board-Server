package com.fastcampus.boardserver.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {

    private HttpStatus status;
    private String code;
    private String message;
    private T requestBody;

}