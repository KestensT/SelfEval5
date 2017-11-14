package be.cegeka.selfEval.application;

import be.cegeka.selfEval.domain.highways.Highway;
import be.cegeka.selfEval.domain.highways.HighwayService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class HighwayControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayController highwayController;

    @Mock
    private HighwayService highwayService;

    @Test
    public void whenAddHighway_shouldReturnHighwayService() throws Exception {
    highwayController.addHighway("E40", "50km");
    verify(highwayService).addHighway("E40", "50km");
    }

    @Test
    public void getAllHighways() throws Exception {
        Highway highway1 = new Highway("E40", "50km");
        Highway highway2 = new Highway("A12", "10km");
        Highway highway3 = new Highway("E314", "40km");

        when(highwayService.getAllHighways()).thenReturn(Arrays.asList(highway1, highway2, highway3));
        assertThat(highwayController.getAllHighways()).containsOnly(highway1, highway2, highway3);
    }
}