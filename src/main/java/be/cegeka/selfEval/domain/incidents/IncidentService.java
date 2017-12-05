package be.cegeka.selfEval.domain.incidents;

import java.util.List;

public interface IncidentService {
    void addIncident(IncidentDto incidentDto, int highwayID); // int terug wegdoen als dit niet goed blijkt te zijn

    List<Incident> getAllIncidents();

    List<Incident> getIncidentsByUserID(int userID);
}
