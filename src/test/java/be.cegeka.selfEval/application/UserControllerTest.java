package be.cegeka.selfEval.application;

import be.cegeka.selfEval.domain.users.User;
import be.cegeka.selfEval.domain.users.UserService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    @Test
    public void getAllUsers() throws Exception {
        User user1 = new User("Gerri");
        User user2 = new User("Seppe");
        User user3 = new User("Domien");

        when(userService.getAllUsers()).thenReturn(Arrays.asList(user1, user2, user3));
        assertThat(userController.getAllUsers()).containsOnly(user1, user2, user3);
    }

    @Test
    public void whenAddUser_shouldReturnUserService() throws Exception {
        userController.addUser("Gerri");
        Mockito.verify(userService).addUser("Gerri");
    }
}