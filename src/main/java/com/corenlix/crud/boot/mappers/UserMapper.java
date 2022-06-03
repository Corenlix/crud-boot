package com.corenlix.crud.boot.mappers;

import com.corenlix.crud.boot.dto.UserDTO;
import com.corenlix.crud.boot.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(User user);

    User toUser(UserDTO dto);

    List<UserDTO> toDTO(List<User> userList);
}
