package test.java.mathutils.module1;
import org.junit.*;

import main.java.mathutils.module1.ArithmeticService;

public class ArithmeticServiceTest{
    ArithmeticService obj1 = new ArithmeticService();
   @Test
    public void testforadd(){
        Assert.assertEquals(10,obj1.add(6, 4));
    }

    @Test
    public void testforsubtract(){
        Assert.assertEquals(0,obj1.subtract(1, 1));
    }

    @Test
    public void testformultiply(){
        Assert.assertEquals(1,obj1.multiply(1, 1));
    }

    @Test
    public void testfordivide(){
        Assert.assertEquals(1,obj1.divide(1, 1));
    }

}
