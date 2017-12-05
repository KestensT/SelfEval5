package be.cegeka.selfEval.application;

import be.cegeka.selfEval.domain.incidents.Incident;
import be.cegeka.selfEval.domain.incidents.IncidentDto;
import be.cegeka.selfEval.domain.incidents.IncidentService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/incident")
@Transactional // draait alles terug bij een fout. Alles gebeurt in 1 transactie
public class IncidentController {

    @Inject     //gebruikt de instantie
    private IncidentService incidentService;

    @PostMapping
    public void addIncident( @RequestBody IncidentDto incidentDto, int highwayID){
        incidentService.addIncident(incidentDto, highwayID);
    }

    @RequestMapping(path = "/all")
    @GetMapping
    public List<Incident> getAllIncidents(){
        return incidentService.getAllIncidents();
    }


}
