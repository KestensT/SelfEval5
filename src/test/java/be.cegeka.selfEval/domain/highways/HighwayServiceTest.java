package be.cegeka.selfEval.domain.highways;

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

public class HighwayServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    HighwayService highwayService;

    @Mock
    HighwayRepository highwayRepository;

    @Test
    public void addHighway_shouldReturnHighwayRepository() throws Exception {
        highwayService.addHighway("name", "distance");

        verify(highwayRepository).addHighway(new Highway("name", "distance"));
    }

    @Test
    public void getAllHighways() throws Exception {
        Highway highway1 = new Highway("E40", "100km");
        Highway highway2 = new Highway("A12", "200km");
        Highway highway3 = new Highway("E314", "300km");

        when(highwayRepository.getAllHighways()).thenReturn(Arrays.asList(highway1, highway2, highway3));
        assertThat(highwayService.getAllHighways()).containsOnly(highway1, highway2, highway3);
    }
}


