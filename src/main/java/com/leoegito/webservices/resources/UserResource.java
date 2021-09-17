package com.leoegito.webservices.resources;

import com.leoegito.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Leo", "leoegitoadm@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(user);
    }

}
