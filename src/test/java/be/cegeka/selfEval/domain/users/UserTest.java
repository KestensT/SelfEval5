package be.cegeka.selfEval.domain.users;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static be.cegeka.selfEval.domain.users.UserTestBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private User user;

    @PersistenceContext
    private EntityManager entityManager;

    @Before
    public void setUp() throws Exception {
        user = aUser()
                .withName("Gerri")
                .withId(5)
                .build();
    }

    @Test
    public void getName_shouldReturnName() throws Exception {
        assertThat(user.getName()).isEqualTo("Gerri");
    }

    @Test
    public void getId_shouldReturnId() throws Exception {
        assertThat(user.getId()).isEqualTo(5);
    }

    @Test
    public void equals_sameObject_isTrue() throws Exception {
        assertThat(user).isEqualTo(user);
    }

    @Test
    public void equals_nullObject_isFalse() throws Exception {
        assertThat(user).isNotEqualTo(null);
    }

    @Test
    public void equals_objectWithSameName_isTrue() throws Exception {
        assertThat(user).isEqualTo(aUser()
                .withName("Gerri")
                .withId(5)
                .build());
    }

    @Test
    public void equals_OtherClass_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(new Object());
    }

    @Test
    public void equals_ObjectWithOtherId_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(aUser()
                .withName("Gerri")
                .withId(1)
                .build());
    }

    @Test
    public void equals_userWithOtherName_isFalse() throws Exception {
        assertThat(user).isNotEqualTo(aUser()
                .withName("Seppe")
                .withId(5)
                .build());
    }

    @Test
    public void equals_userWithNullName_isFalse() throws Exception {
        assertThat(user).isNotEqualTo(aUser()
                .withName(null)
                .withId(5));
    }

    @Test
    public void equals_userWithNoNullNameButDifferent_isFalse() throws Exception {
        assertThat(aUser()
                .withName(null)
                .withId(5)
                .build())
                .isNotEqualTo(aUser()
                        .withName("Gerri")
                        .withId(5)
                        .build());
    }
}