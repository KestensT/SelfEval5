package be.cegeka.selfEval.domain.incidents;

import org.springframework.test.util.ReflectionTestUtils;

public class IncidentTestBuilder {

    private String name;
    private String type;
    private String distance;
    private int id;

    public static IncidentTestBuilder anIncident(){
        return new IncidentTestBuilder()
                .withName("Ongeval")
                .withType("Auto")
                .withDistance("10km file");
    }

    public Incident build(){
        Incident incident = new Incident(name, type, distance);
        ReflectionTestUtils.setField(incident, "id", id);
        return incident;
    }

    public IncidentTestBuilder withName(String name){
        this.name = name;
        return this;
    }

    public IncidentTestBuilder withType(String type){
        this.type = type;
        return this;
    }

    public IncidentTestBuilder withDistance(String distance){
        this.distance = distance;
        return this;
    }

    public IncidentTestBuilder withId (int id){
        this.id = id;
        return this;
    }
















}
