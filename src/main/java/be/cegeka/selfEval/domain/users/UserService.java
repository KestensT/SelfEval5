package be.cegeka.selfEval.domain.users;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UserService {

    @Inject
    private UserRepository userRepository;

    public void addUser(String name){
        userRepository.addUser(new User(name));
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
