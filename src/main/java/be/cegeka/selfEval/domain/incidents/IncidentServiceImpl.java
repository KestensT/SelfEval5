package be.cegeka.selfEval.domain.incidents;

import be.cegeka.selfEval.domain.highways.Highway;
import be.cegeka.selfEval.domain.highways.HighwayService;

import javax.inject.Inject;
import javax.inject.Named;

@Named( "test")
public class IncidentServiceImpl implements IncidentService {

    @Inject
    private IncidentMapper incidentMapper;

    @Inject
    private IncidentRepository incidentRepository;

    @Inject
    private HighwayService highwayService;

    @Override
    public void addIncident(IncidentDto incidentDto) {
        Incident incident = incidentMapper.createIncident(incidentDto);
        incidentRepository.save(incident);
    }

    public Highway getHighwayByID(int id){
     Highway highway = highwayService.getHighwayByID(id);
     return highway;
    }


}

