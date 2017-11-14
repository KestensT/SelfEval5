package be.cegeka.selfEval.domain.users;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class UserServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void addUser_shouldCallUponUserRepository() throws Exception {
        userService.addUser("Seppe");
        Mockito.verify(userRepository).addUser(new User("Seppe"));
    }
}