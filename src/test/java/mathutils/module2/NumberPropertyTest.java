package test.java.mathutils.module2;
import org.junit.*;
import main.java.mathutils.module2.NumberProperty;

public class NumberPropertyTest {
    NumberProperty np=new NumberProperty();

    @Test 
    public void testForPrime(){
        Assert.assertEquals(1, np.checkPrime(23));  // Prime
        Assert.assertEquals(0, np.checkPrime(80));  // Not Prime
        Assert.assertTrue(np.checkPrime(2) == 1);
        Assert.assertFalse(np.checkPrime(80) == 1);
        Assert.assertNotEquals(1, np.checkPrime(100));
        Assert.assertEquals(0, np.checkPrime(1));
        
    }
    
    @Test
    public void testForPalindrome() {
        Assert.assertEquals(1, np.checkPalindrome(121));
        Assert.assertTrue(np.checkPalindrome(7) == 1);
        Assert.assertFalse(np.checkPalindrome(123) == 1);
        Assert.assertNotEquals(1, np.checkPalindrome(10));
    }

    
    @Test
    public void testForEvenOdd() {
        Assert.assertEquals(1, np.checkEvenOdd(10));
        Assert.assertTrue(np.checkEvenOdd(0) == 1);
        Assert.assertFalse(np.checkEvenOdd(7) == 1);
        Assert.assertNotEquals(1, np.checkEvenOdd(3));
    }

}
