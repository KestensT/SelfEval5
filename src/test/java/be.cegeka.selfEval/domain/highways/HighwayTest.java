package be.cegeka.selfEval.domain.highways;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HighwayTest {

    private Highway highway;

    @Before
    public void setUp() throws Exception {
        highway = new Highway("name","distance");
    }

    @Test
    public void getName_shouldReturnName() throws Exception {
        assertThat(highway.getName()).isEqualTo("name");
    }
}