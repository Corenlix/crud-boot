package com.corenlix.crud.boot.service;

import com.corenlix.crud.boot.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsersByCount(int number);

    List<UserDTO> getUsers();

    UserDTO getById(int id);

    void saveUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO, int id);

    void delete(int id);
}
