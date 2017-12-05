package be.cegeka.selfEval.domain.incidents;

import be.cegeka.selfEval.domain.highways.Highway;
import be.cegeka.selfEval.domain.highways.HighwayRepository;
import be.cegeka.selfEval.domain.highways.HighwayService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("test")
public class IncidentServiceImpl implements IncidentService {

    @Inject
    private IncidentMapper incidentMapper;

    @Inject
    private IncidentRepository incidentRepository;

    @Inject
    private HighwayService highwayService;

    @Inject
    private HighwayRepository highwayRepository;


    public void addIncident(IncidentDto incidentDto, int highwayID) {
        Incident incident = incidentMapper.createIncident(incidentDto);
        incident.setHighway(highwayRepository.getHighwayByID(highwayID));       // int highwayID toegevoegd, en de setter gebruikt. Juiste manier van denken?
        incidentRepository.save(incident);

    }

    public Highway getHighwayByID(int id){
     Highway highway = highwayService.getHighwayByID(id);
     return highway;
    }


    public List<Incident> getAllIncidents(){
        return incidentRepository.getAllIncidents();
    }

    public List<Incident> getIncidentsByUserID(int userID){
        return null;        // ook nog te implementeren
    }
}

