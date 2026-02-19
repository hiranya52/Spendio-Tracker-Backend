package edu.icet.service;

import edu.icet.mapper.UserMapper;
import edu.icet.model.dto.UserDTO;
import edu.icet.model.entity.User;
import edu.icet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserDTO userDTO) {

        User user = UserMapper.toEntity(userDTO);
        userRepository.save(user);

    }

}
