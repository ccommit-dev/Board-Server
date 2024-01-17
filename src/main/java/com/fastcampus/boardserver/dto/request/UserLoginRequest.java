package com.fastcampus.boardserver.dto.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class UserLoginRequest {
    @NonNull
    private String userId;
    @NonNull
    private String password;
}
