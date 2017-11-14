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

    @Test
    public void equals_objectWithSameNameAndDistance_isTrue() throws Exception {
        assertThat(highway).isEqualTo(aHighway()
                .withName("E40")
                .withDistance("50km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_OtherClass_IsFalse() throws Exception {
        assertThat(highway).isNotEqualTo(new Object());
    }

    @Test
    public void equals_ObjectWithOtherId_IsFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withName("E40")
                .withDistance("50km")
                .withId(1)
                .build());
    }

    @Test
    public void equals_ObjectWithOtherName_IsFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withName("A12")
                .withDistance("50km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_ObjectWithOtherDistance_IsFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withName("E40")
                .withDistance("500km")
                .withId(5)
                .build());
    }

    @Test
    public void equals_ObjectWithNullName_IsFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withId(10)
                .withName(null)
                .withDistance("50km")
                .build());
    }

    @Test
    public void equals_ObjectWithBothNullName_IsTrue() throws Exception {
        assertThat(aHighway()
                .withDistance("50km")
                .withId(10)
                .withName(null)
                .build())
                .isEqualTo(aHighway()
                        .withDistance("50km")
                        .withId(10)
                        .withName(null)
                        .build()
                );
    }

    @Test
    public void equals_ObjectWithNoNullName_IsFalse() throws Exception {
        assertThat(aHighway()
                .withDistance("50km")
                .withId(10)
                .withName(null)
                .build())
                .isNotEqualTo(aHighway()
                        .withDistance("50km")
                        .withId(10)
                        .withName("E40")
                        .build()
                );
    }

    @Test
    public void equals_ObjectWithOtherDistance_isFalse() throws Exception {
        assertThat(aHighway()
                .withDistance("50km")
                .withId(10)
                .withName("E40")
                .build())
                .isNotEqualTo(aHighway()
                        .withDistance("20m")
                        .withId(10)
                        .withName("E40")
                        .build()
                );

    }

    @Test
    public void equals_ObjectWithBothNullDistance_isTrue() throws Exception {
        assertThat(aHighway()
                .withDistance(null)
                .withId(10)
                .withName("E40")
                .build())
                .isEqualTo(aHighway()
                        .withDistance(null)
                        .withId(10)
                        .withName("E40")
                        .build()
                );

    }

    @Test
    public void equals_ObjectWithNoNullDistance_IsFalse() throws Exception {
        assertThat(aHighway()
                .withDistance(null)
                .withId(10)
                .withName("E40")
                .build())
                .isNotEqualTo(aHighway()
                        .withDistance("50km")
                        .withId(10)
                        .withName("E40")
                        .build()
                );
    }
}