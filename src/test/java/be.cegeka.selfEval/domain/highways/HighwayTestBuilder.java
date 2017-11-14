package be.cegeka.selfEval.domain.highways;

import org.springframework.test.util.ReflectionTestUtils;

public class HighwayTestBuilder {

    private String name;
    private String distance;
    private int id;

    public static HighwayTestBuilder aHighway(){
        return new HighwayTestBuilder()
                .withName("E40")
                .withDistance("50km");
    }

    public Highway build(){
        Highway highway = new Highway(name, distance);
        ReflectionTestUtils.setField(highway, "id", id);
        return highway;
    }

    public HighwayTestBuilder withName (String name){
        this.name = name;
        return this;
    }

    public HighwayTestBuilder withDistance(String distance){
        this.distance = distance;
        return this;
    }

    public HighwayTestBuilder withId(int id){
        this.id = id;
        return this;
    }


}
