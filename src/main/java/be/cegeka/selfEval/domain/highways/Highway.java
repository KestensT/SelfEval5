package be.cegeka.selfEval.domain.highways;


import javax.persistence.*;

@Entity
@Table(name = "HIGHWAYS")
public class Highway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HIGHWAY_ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DISTANCE")
    private String distance;

    public Highway() {
    }

    public Highway(String name, String distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Highway highway = (Highway) o;

        if (id != highway.id) return false;
        if (name != null ? !name.equals(highway.name) : highway.name != null) return false;
        return distance != null ? distance.equals(highway.distance) : highway.distance == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }
}
