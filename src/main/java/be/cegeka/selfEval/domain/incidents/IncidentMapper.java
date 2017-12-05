package be.cegeka.selfEval.domain.incidents;

import javax.inject.Named;

@Named
public class IncidentMapper {


    public Incident createIncident(IncidentDto incidentDto) {
        return new Incident (incidentDto.getName(), incidentDto.getType(), incidentDto.getDistance(), incidentDto.getHighway(), incidentDto.getUser());
    }
}
