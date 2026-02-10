package mathutils.module3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StatisticsServiceTest {

    StatisticsService service = new StatisticsService();

    @Test
    public void testCalculateMean_NormalArray() {
        int[] numbers = {10, 20, 30};
        double expectedMean = 20.0;
        assertEquals(expectedMean, service.calculateMean(numbers), 0.001);
    }

    @Test
    public void testCalculateMax_NormalArray() {
        int[] numbers = {10, 20, 30};
        int expectedMax = 30;
        assertEquals(expectedMax, service.calculateMax(numbers));
    }

    @Test
    public void testCalculateMin_NormalArray() {
        int[] numbers = {10, 20, 5, 30};
        int expectedMin = 5;
        assertEquals(expectedMin, service.calculateMin(numbers));
    }
    @Test
    public void testCalculateMean_SingleElementArray() {
        int[] numbers = {42};
        double expectedMean = 42.0;
        assertEquals(expectedMean, service.calculateMean(numbers), 0.001);  
    }

}
    

