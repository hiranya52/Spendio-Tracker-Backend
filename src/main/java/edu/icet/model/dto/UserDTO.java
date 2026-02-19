package edu.icet.model.dto;

import jakarta.persistence.Id;
import jakarta.websocket.server.ServerEndpoint;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

}
