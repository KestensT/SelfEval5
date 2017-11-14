package be.cegeka.selfEval.domain.incidents;


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

    public Incident() {
    }

    public Incident(String name, String type, String distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
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
}
