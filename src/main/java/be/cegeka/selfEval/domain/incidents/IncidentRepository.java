package be.cegeka.selfEval.domain.incidents;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class IncidentRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void save(Incident incident) {
        entityManager.persist(incident);
    }

    public List<Incident> getAllIncidents(){
        return entityManager.createQuery("select i from Incident i", Incident.class).getResultList();
    }

    public List<Incident> getIncidentsByUserID(int userID){
        return null;                        // moet ik nog implementeren
    }
}
