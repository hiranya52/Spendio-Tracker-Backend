package edu.icet.service;

import edu.icet.model.dto.UserDTO;
import edu.icet.model.entity.User;
import edu.icet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getPassword()
        );

    }

}
