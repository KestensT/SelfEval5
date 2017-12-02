package be.cegeka.selfEval.domain.incidents;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class IncidentRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void save(Incident incident) {
        entityManager.persist(incident);
    }
}
