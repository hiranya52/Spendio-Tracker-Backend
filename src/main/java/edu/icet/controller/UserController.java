package edu.icet.controller;


import edu.icet.model.dto.UserDTO;
import edu.icet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public String load(){
        return "Load User Controller...";
    }

    @PostMapping("/add")
    public void addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }

    @GetMapping("/get{email}")
    public UserDTO getUser(@RequestParam String email){
        return userService.getUser(email);
    }

}
