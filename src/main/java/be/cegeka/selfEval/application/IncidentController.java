package be.cegeka.selfEval.application;

import be.cegeka.selfEval.domain.incidents.IncidentDto;
import be.cegeka.selfEval.domain.incidents.IncidentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/incident")
@Transactional // draait alles terug bij een fout. Alles gebeurt in 1 transactie
public class IncidentController {

    @Inject     //gebruikt de instantie
    private IncidentService incidentService;

    @PostMapping
    public void addIncident( @RequestBody IncidentDto incidentDto){
        incidentService.addIncident(incidentDto);
    }


}
