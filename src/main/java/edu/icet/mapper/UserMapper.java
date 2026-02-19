package edu.icet.mapper;

import edu.icet.model.dto.UserDTO;
import edu.icet.model.entity.User;

public class UserMapper {

    public static User toEntity(UserDTO dto) {
        return new User(
                dto.getName(),
                dto.getEmail(),
                dto.getPassword()
        );
    }

    // Entity → DTO
    public static UserDTO toDto(User user) {
        UserDTO dto = new UserDTO();
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        return dto;
    }

}
