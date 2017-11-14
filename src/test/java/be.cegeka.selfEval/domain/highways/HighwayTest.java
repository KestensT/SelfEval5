package be.cegeka.selfEval.domain.highways;

import org.junit.Before;
import org.junit.Test;

import static be.cegeka.selfEval.domain.highways.HighwayTestBuilder.aHighway;
import static org.assertj.core.api.Assertions.assertThat;

public class HighwayTest {

    private Highway highway;

    @Before
    public void setUp() throws Exception {
        highway = aHighway()
                .withName("E40")
                .withDistance("50km")
                .withId(5)
                .build();
    }

    @Test
    public void getName_shouldReturnName() throws Exception {
        assertThat(highway.getName()).isEqualTo("E40");
    }

    @Test
    public void getDistance_shouldReturnDistance() throws Exception {
        assertThat(highway.getDistance()).isEqualTo("50km");
    }

    @Test
    public void equals_sameObject_isTrue() throws Exception {
        assertThat(highway).isEqualTo(highway);
    }

    @Test
    public void equals_nullObject_isFalse() throws Exception {
        assertThat(highway).isNotEqualTo(null);
    }

    @Test
    public void getId_shouldReturnId() throws Exception {
        assertThat(highway.getId()).isEqualTo(5);
    }
}