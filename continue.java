import java.util.*;
class continue_1
{
    public static void main(String args[])
    {
        System.out.println("continue example");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            continue;
            System.out.println(i);
        }
    }
}