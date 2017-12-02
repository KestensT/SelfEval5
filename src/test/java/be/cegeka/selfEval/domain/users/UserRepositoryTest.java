package be.cegeka.selfEval.domain.users;


import be.cegeka.selfEval.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class UserRepositoryTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private UserRepository userRepository;
    private User Seppe, Gerri;

    @Before
    public void setUp() throws Exception {
        Seppe = new User("Seppe");
        Gerri = new User("Gerri");

        entityManager.persist(Seppe);
        entityManager.persist(Gerri);
    }

    @Test
    public void addUser_shouldAddUser() throws Exception {
        User testUser = new User("Tester");
        userRepository.addUser(testUser);
        assertThat(userRepository.getAllUsers()).contains(Seppe, Gerri, testUser);
        assertThat(userRepository.getAllUsers()).size().isEqualTo(3);
    }

    @Test
    public void getAll_shouldReturnAll() throws Exception {
        assertThat(userRepository.getAllUsers()).contains(Seppe, Gerri);
    }
}