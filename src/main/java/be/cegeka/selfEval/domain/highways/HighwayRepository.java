package be.cegeka.selfEval.domain.highways;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class HighwayRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Highway> getAllHighways(){
        return entityManager.createQuery("Select b from Highway b", Highway.class).getResultList();
    }

    public void addHighway(Highway highway){
        entityManager.persist(highway);
    }

    public Highway getHighwayByID(int id){
        return entityManager.createQuery("Select h from Highway h where h.id = :id", Highway.class).setParameter("id", id).getSingleResult(); // :id wordt extern meegegeven
    }
}
