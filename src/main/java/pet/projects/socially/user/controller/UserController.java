package pet.projects.socially.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pet.projects.socially.user.dto.UserResponse;

@RestController
public class UserController {
    public ResponseEntity<UserResponse> addUser() {

        return new ResponseEntity<>(new UserResponse(1L, "s", "s"), HttpStatus.CREATED);
    }
}
