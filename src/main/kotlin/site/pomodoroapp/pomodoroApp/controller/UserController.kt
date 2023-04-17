package site.pomodoroapp.pomodoroApp.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.pomodoroapp.pomodoroApp.dto.UserDto

@RestController
@RequestMapping("api/v1/users")
class UserController {

    @GetMapping()
    fun getUsers(): ResponseEntity<List<String>>{
        var user: UserDto = UserDto("Kevin", "pass")
        var users = ArrayList<String>()
        users.add(user.username)
        //test
        return ResponseEntity.ok(users);
    }
}