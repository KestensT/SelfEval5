package be.cegeka.selfEval.domain.highways;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class HighwayService {
    @Inject
    private HighwayRepository highwayRepository;

    public List<Highway> getAllHighways(){
        return highwayRepository.getAllHighways();
    }

    public void addHighway(String name, String distance){
        highwayRepository.addHighway(new Highway(name, distance));
    }










}
