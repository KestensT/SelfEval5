package be.cegeka.selfEval.application;

import be.cegeka.selfEval.domain.users.User;
import be.cegeka.selfEval.domain.users.UserService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
@Transactional
public class UserController {

    @Inject
    private UserService userService;

    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(path = "/addUser")
    public void addUser(@RequestParam(value = "name", required = true) String name) {
        userService.addUser(name);
    }
}
