package be.cegeka.selfEval.domain.users;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers(){
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public void addUser(User user){
        entityManager.persist(user);
    }








}
