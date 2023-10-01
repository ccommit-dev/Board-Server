package com.fastcampus.boardserver.dto.response;

import com.fastcampus.boardserver.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserInfoResponse {
    private UserDTO userDTO;
}
