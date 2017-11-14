package be.cegeka.selfEval.application;


import be.cegeka.selfEval.domain.highways.Highway;
import be.cegeka.selfEval.domain.highways.HighwayService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/highway")
@Transactional
public class HighwayController {
    @Inject
    private HighwayService highwayService;

    @GetMapping(path = "/getAllHighways")
    public List<Highway> getAllHighways(){
        return highwayService.getAllHighways();
    }

    @PostMapping(path = "/addHighway")
    public void addHighway(@RequestParam(value = "name", required = true) String name,
                           @RequestParam(value = "distance", required = true) String distance){
        highwayService.addHighway(name, distance);
    }

}
