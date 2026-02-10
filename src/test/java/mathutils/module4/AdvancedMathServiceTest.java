package test.java.mathutils.module4;
import org.junit.*;

import main.java.mathutils.module4.AdvancedMathService;

public class AdvancedMathServiceTest 
{   AdvancedMathService obj =new AdvancedMathService();
    @Test 
    public void test1forfact()
    {
        Assert.assertEquals(2,obj.fact(2));
        Assert.assertEquals(6,obj.fact(3));
    } 
    @Test 
    public void test1forpower()
    {
        Assert.assertEquals(4,obj.power(2,2));
        Assert.assertEquals(8,obj.power(2,3));
    } 
}
