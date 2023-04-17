package com.pomodorobackend.pomodoro.controller;

import com.pomodorobackend.pomodoro.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    public ResponseEntity<List<String>> getUsers(){
        UserDto user = UserDto.builder()
                .username("Kevin")
                .password("pass")
                .build();
        List<String> users = new ArrayList<>();
        users.add(user.getUsername());
        return ResponseEntity.ok(users);

    }
}
