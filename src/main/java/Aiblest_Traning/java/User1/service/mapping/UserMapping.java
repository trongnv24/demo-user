package Aiblest_Traning.java.User1.service.mapping;

import Aiblest_Traning.java.User1.dto.request.UserRequest;
import Aiblest_Traning.java.User1.dto.response.UserResponse;
import Aiblest_Traning.java.User1.entity.UserEntity;

public class UserMapping {
    public static UserEntity convertDtoToEntity (UserRequest dto){
        UserEntity entity = new UserEntity();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setLastname(dto.getLastname());
        return entity;
    }
    public static UserResponse convertEntityToUserResponse (UserEntity entity){
        UserResponse dto = new UserResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setLastname(entity.getLastname());
        return dto;
    }
}
