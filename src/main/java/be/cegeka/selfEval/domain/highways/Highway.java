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
}
