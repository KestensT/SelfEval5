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
}
