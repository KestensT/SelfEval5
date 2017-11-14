package be.cegeka.selfEval.domain.incidents;

import org.junit.Before;
import org.junit.Test;

import static be.cegeka.selfEval.domain.incidents.IncidentTestBuilder.anIncident;
import static org.assertj.core.api.Assertions.assertThat;

public class IncidentTest {

    private Incident incident;

    @Before
    public void setUp() throws Exception {
        incident = anIncident()
                .withName("Auto ongeval")
                .withType("Files")
                .withDistance("5km")
                .withId(5)
                .build();
    }

    @Test
    public void getName_shouldReturnName() throws Exception {
        assertThat(incident.getName()).isEqualTo("Auto ongeval");
    }

    @Test
    public void getType_shouldReturnType() throws Exception {
        assertThat(incident.getType()).isEqualTo("Files");
    }

    @Test
    public void getDistance_shouldReturnDistance() throws Exception {
        assertThat(incident.getDistance()).isEqualTo("5km");
    }

    @Test
    public void getId_shouldReturnId() throws Exception {
        assertThat(incident.getId()).isEqualTo(5);
    }

    @Test
    public void equals_objectWithSameNameTypeAndDistance_isTrue() throws Exception {
        assertThat(incident).isEqualTo(anIncident()
                .withName("Auto ongeval")
                .withDistance("5km")
                .withType("Files")
                .withId(5)
                .build());
    }

    @Test
    public void equals_otherClass_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(new Object());
    }

    @Test
    public void equals_withOtherId_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(anIncident()
                .withName("Auto ongeval")
                .withType("Files")
                .withDistance("5km")
                .withId(10)
                .build());
    }

    @Test
    public void equals_withOtherName_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(anIncident()
                .withName("Motor ongeval")
                .withType("Files")
                .withDistance("5km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_withOtherType_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(anIncident()
                .withName("Auto ongeval")
                .withType("Vertraging")
                .withDistance("5km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_withOtherDistance_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(anIncident()
                .withName("Auto ongeval")
                .withType("Files")
                .withDistance("10000km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_withNullName_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(anIncident()
                .withName(null)
                .withType("Files")
                .withDistance("5km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_objectWithOneNullName_isFalse() throws Exception {
        assertThat(anIncident()
                .withDistance("50km")
                .withName(null)
                .withType("Vertraging")
                .withId(5)
                .build())
                .isNotEqualTo(anIncident()
                        .withDistance("50k")
                        .withName("Auto ongeval")
                        .withType("Vertraging")
                        .withId(5)
                        .build());
    }


    @Test
    public void equals_ObjectWithOtherDistance_isFalse() throws Exception {
        assertThat(anIncident()
                .withDistance("50km")
                .withId(10)
                .withName("E40")
                .withType("Auto ongeval")
                .build())
                .isNotEqualTo(anIncident()
                        .withDistance("20m")
                        .withId(10)
                        .withName("E40")
                        .withType("Auto ongeval")
                        .build()
                );

    }

    @Test
    public void equals_ObjectWithBothNullDistance_isTrue() throws Exception {
        assertThat(anIncident()
                .withDistance(null)
                .withId(10)
                .withName("E40")
                .build())
                .isEqualTo(anIncident()
                        .withDistance(null)
                        .withId(10)
                        .withName("E40")
                        .build()
                );

    }

    @Test
    public void equals_ObjectWithNoNullDistance_IsFalse() throws Exception {
        assertThat(anIncident()
                .withDistance(null)
                .withId(10)
                .withName("E40")
                .build())
                .isNotEqualTo(anIncident()
                        .withDistance("50km")
                        .withId(10)
                        .withName("E40")
                        .build()
                );
    }

    @Test
    public void equals_sameObject_isTrue() throws Exception {
        assertThat(incident).isEqualTo(incident);
    }

    @Test
    public void equals_nullObject_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(null);
    }

    @Test
    public void equals_ObjectWithOtherName_IsFalse() throws Exception {
        assertThat(incident).isNotEqualTo(anIncident()
                .withName("A12")
                .withDistance("50km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_ObjectWithBothNullName_isTrue() throws Exception {
        assertThat(anIncident()
                .withDistance("5km")
                .withId(10)
                .withName(null)
                .build())
                .isEqualTo(anIncident()
                        .withDistance("5km")
                        .withId(10)
                        .withName(null)
                        .build()
                );
    }

    @Test
    public void equals_ObjectWithNoNullName_IsFalse() throws Exception {
        assertThat(anIncident()
                .withDistance("50km")
                .withId(10)
                .withName(null)
                .build())
                .isNotEqualTo(anIncident()
                        .withDistance("50km")
                        .withId(10)
                        .withName("E40")
                        .build()
                );
    }

    @Test
    public void equals_ObjectWithOtherType_isFalse() throws Exception {
        assertThat(anIncident()
                .withDistance("50km")
                .withId(10)
                .withName("E40")
                .withType("Files")
                .build())
                .isNotEqualTo(anIncident()
                        .withDistance("20m")
                        .withId(10)
                        .withName("E40")
                        .withType("Ongeval")
                        .build()
                );

    }
}