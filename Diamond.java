import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class Diamond
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("diamond.dat"));
        int counter = 0;
        int totalCases = in.nextInt();
        
        while(counter<totalCases)
        {
            counter++;
            drawDiamond(in.nextInt());
            
        }

    }
    public static void drawDiamond(int numOut)
    {

        int num = numOut;
        if(num==1)
        {
            System.out.println("*\n*");
            return;
        }
        for(int i = 0; i<(num*2)-1; i++)
        {
            if(i<num)
            {
                for(int j = 0; j<i+1; j++)
                {
                    if(j==0 && i!=0)
                    {
                        System.out.print("*");
                    }
                    else if(j != i)
                    {
                        System.out.print(" ");

                    }
                    else
                    {
                        System.out.print("*\n");
                    }
                }
            }
            else
            {
                for(int j = 0; j<num; j++)
                {
                    if(j==num-1)
                    {
                        System.out.print("*\n");
                    }
                    else if(j<(i+1-num))
                    {
                        System.out.print(" ");
                    }
                    else if(j==(i+1-num))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                   
                }
            }
            
        }
    }
    /*public static void drawDiamond(int num)
    {
        
        int cur = num;
        if(cur==1)
        {
            System.out.println("*\n*");
            return;
        }
        int total = (cur!=1)? cur*cur : 2;
        for(int i = 1; i<total; i++)
        {
            if(i<cur)
            {
                for(int j = 0; j<i; j++)
                {

                    if(j==0)
                    {
                        System.out.print("*");
                    }
                    if(j==i)
                    {
                        System.out.print("*\n");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            else if(i==cur)
            {
                for(int j = 0; j<cur; j++)
                {
                    if(j==0 || j==cur)
                    {
                        System.out.print("*");

                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
               
                
        }
    }*/
}