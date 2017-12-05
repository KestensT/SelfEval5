package be.cegeka.selfEval.domain.incidents;


import be.cegeka.selfEval.domain.highways.Highway;
import be.cegeka.selfEval.domain.users.User;

import javax.persistence.*;

@Entity
@Table(name = "INCIDENTS")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INCIDENT_ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DISTANCE")
    private String distance;
    @ManyToOne
    @JoinColumn(name = "HIGHWAY_ID")
    private Highway highway;
    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;              // elk reported incident heeft 1 user


    public Incident() {
    }

    public Incident(String name, String type, String distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
    }

    public Incident(String name, String type, String distance, Highway highway) {
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.highway = highway;
    }

    public Incident(String name, String type, String distance, Highway highway, User user) {
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.highway = highway;
        this.user = user;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Incident incident = (Incident) o;

        if (id != incident.id) return false;
        if (name != null ? !name.equals(incident.name) : incident.name != null) return false;
        if (type != null ? !type.equals(incident.type) : incident.type != null) return false;
        return distance != null ? distance.equals(incident.distance) : incident.distance == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }

    public void setHighway(Highway highway) {
        this.highway = highway;
    }
}
