package be.cegeka.selfEval.domain.highways;

import be.cegeka.selfEval.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class HighwayRepositoryTest {

    @Inject
    private HighwayRepository highwayRepository;

    @PersistenceContext
    private EntityManager entityManager;
    private Highway highway1;
    private Highway highway2;
    private Highway highway3;

    @Before
    public void setUp() throws Exception {
        highway1 = new Highway("E40", "100km");
        highway2 = new Highway("A12", "200km");
        highway3 = new Highway("E314", "300km");

        highwayRepository.addHighway(highway1);
        highwayRepository.addHighway(highway2);
        highwayRepository.addHighway(highway3);

        entityManager.persist(highway1);
        entityManager.persist(highway2);
        entityManager.persist(highway3);
    }

    @Test
    public void addHighwayToRepository() throws Exception {
        assertThat(highwayRepository.getAllHighways()).contains(highway1, highway2, highway3);
    }

    @Test
    public void getAllHighways_contains2HighwaysFromBefore() throws Exception {
        assertThat(highwayRepository.getAllHighways()).contains(highway3, highway1);
    }

    
}