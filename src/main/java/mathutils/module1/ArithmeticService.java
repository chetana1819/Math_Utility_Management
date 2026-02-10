package main.java.mathutils.module1;

public class ArithmeticService {
    public int add(int a,int b){
        int ans1 = a + b;
        return ans1;
    }

    public int subtract(int a,int b){
        int ans2 = a - b;
        return ans2;
    }

    public int multiply(int a,int b){
        int ans3 = a * b;
        return ans3;
    }

    public int divide(int a,int b){
        if (b==0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int ans4 = a / b;
        return ans4;
    }
}
