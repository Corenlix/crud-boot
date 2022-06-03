package com.corenlix.crud.boot.service.impl;

import com.corenlix.crud.boot.dao.UserDao;
import com.corenlix.crud.boot.dto.UserDTO;
import com.corenlix.crud.boot.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService implements com.corenlix.crud.boot.service.UserService {
    private final UserDao userDao;

    @Override
    public List<UserDTO> getUsersByCount(int count) {
        return UserMapper.INSTANCE.toDTO(userDao.getUsersByCount(count));
    }

    @Override
    public List<UserDTO> getUsers() {
        return UserMapper.INSTANCE.toDTO(userDao.getUsers());
    }

    @Override
    public UserDTO getById(int id) {
        return UserMapper.INSTANCE.toDTO(userDao.getById(id));
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        userDao.saveUser(UserMapper.INSTANCE.toUser(userDTO));
    }

    @Override
    public void updateUser(UserDTO userDTO, int id) {
        userDao.updateUser(UserMapper.INSTANCE.toUser(userDTO), id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
