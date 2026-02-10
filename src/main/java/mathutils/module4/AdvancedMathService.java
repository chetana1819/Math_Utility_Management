package main.java.mathutils.module4;

public class AdvancedMathService 
{
    public int fact(int a)
    {
        if(a==0)return 1;

        return a*fact(a-1);
    }    

    public int power(int num, int p)
    {
        return (p>=0)? pow(num,p):1/pow(num,p);
    }

    public int pow(int num, int p)
    {
        if (p == 0)return 1;
        int half = pow(num,p/2);
        if(p % 2 == 0)return half*half;
        else if(p > 0)return num*half*half;
        else return (half*half)/p;
    }
}
