package com.fastcampus.boardserver.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserDTO {
    public enum Status {
        DEFAULT, ADMIN, DELETED
    }
    private int id;
    private String userId;
    private String password;
    private String nickName;
    private boolean isAdmin;
    private Date createTime;
    private boolean isWithDraw;
    private Status status;
    private Date updateTime;

    public UserDTO(){
    }

    public UserDTO(String id, String password, String name, String phone, String address, Status status, Date createTime, Date updateTime, boolean isAdmin) {
        this.userId = id;
        this.password = password;
        this.nickName = name;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isAdmin = isAdmin;
    }

    public static boolean hasNullDataBeforeSignup(UserDTO userDTO) {
        return userDTO.getUserId() == null || userDTO.getPassword() == null
                || userDTO.getNickName() == null;
    }
}
