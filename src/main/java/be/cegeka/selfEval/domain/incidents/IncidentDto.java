package be.cegeka.selfEval.domain.incidents;

import be.cegeka.selfEval.domain.highways.Highway;
import be.cegeka.selfEval.domain.users.User;

public class IncidentDto {

    private String name;
    private String type;
    private String distance;
    private Highway highway;
    private User user;

    public IncidentDto() {
    }

    public IncidentDto(String name, String type, String distance, Highway highway) {
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.highway = highway;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDistance() {
        return distance;
    }

    public Highway getHighway() {
        return highway;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setHighway(Highway highway) {
        this.highway = highway;
    }
}
