import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphiteTest {

    @Test
    public void shouldDegradePointLevelAndTotalGraphiteByOnePointWhenUseIsCalled(){
        Graphite graphite = new Graphite();
        int totalGraphite = 100;
        int maxPointLevel = 20;
        graphite.totalGraphiteLevel = totalGraphite;
        graphite.pointLevel = maxPointLevel;

        graphite.use();

        int expectedTotalGraphiteLevel = 99;
        int expectedPointLevel = 19;
        assertEquals(expectedTotalGraphiteLevel, graphite.totalGraphiteLevel);
        assertEquals(expectedPointLevel, graphite.pointLevel);

    }
}
