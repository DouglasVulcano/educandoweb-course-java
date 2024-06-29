package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Douglas", "vulcanodouglas1708@gmail.com", "111111111", "password");
        return ResponseEntity.status(HttpStatus.OK).body(u);
    }
}
