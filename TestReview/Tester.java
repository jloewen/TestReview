
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
    
    

    //problem 9
    //before: 11
    //after: 11
    public static int wacky(int x, int y)
    {
        if(x <= 1)
            return y;
        else
            return wacky(x - 1,y - 1) + y;
    }

    //problem 10
    //before: 8
    //after: 8
    public static int go(int x, int y)
    {
        if(x <= 1)
            return y;
        else
            return go(x - 1,y) + y;
    }

    //problem 11
    //before: pacmancman
    //after: pacmancman
    public static String wow(String s, int pos)
    {
        if(pos > s.length())
            return s.substring(0, s.length()/2);
        else
            return s + wow(s.substring(pos), pos + 1);
    }

}
