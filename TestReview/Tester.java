
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    //problems 2 - 4
    //before: 1, 5, -1  
    //after: 1, 5, -1 
    public static void fun234(int x)
    {
        if(x > 0)
        {
            System.out.print(x);
            fun234(x-1);
        }
    }

    //problem 5
    //before: 454321
    //after: 4543214
    public static void fun5(int x)
    {
        if(x < 5)
        {
            System.out.print(x);
            fun5(x+1);
            System.out.print(x);
        }
    }

    //problem 6
    //before: 6
    //after: 6
    public static void fun6(int x)
    {
        if(x < 5)
            fun6(x-1);
        System.out.print(x);
    }

    //problem 7
    //before: 1 
    //after: 1
    public static int fun7(int x){
        if(x < 3)
            return 1;
        else
            return x + fun7(x - 1);
    }

}

