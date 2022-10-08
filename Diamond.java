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
            System.out.println("*\n*"); //if we have a 1 diamond, just decided to hard code :P
            return;
        }
        for(int i = 0; i<(num*2)-1; i++)
        {
            if(i<num) //first half of diamond, including middle part
            {
                for(int j = 0; j<i+1; j++)
                {
                    if(j==0 && i!=0)
                    {
                        System.out.print("*"); //print out at start of every line a *
                    }
                    else if(j != i)
                    {
                        System.out.print(" "); //fills middle with " "

                    }
                    else
                    {
                        System.out.print("*\n"); //ends lines off with asterisk, new lines for next part
                    }
                }
            }
            else
            {
                for(int j = 0; j<num; j++)
                {
                    if(j==num-1)
                    {
                        System.out.print("*\n"); //basically if it is at the end, asterisk it as per the pattern
                    }
                    else if(j<(i+1-num))
                    {
                        System.out.print(" "); //the formula in the if statement should have been i-num, you add the +1 due to how I have the loop starting at 0 rather than 1
                    }
                    else if(j==(i+1-num))
                    {
                        System.out.print("*"); //only prints asterisk as per the pattern/formula
                    }
                    else
                    {
                        System.out.print(" "); //ALL ENCAPSULATING ELSE!
                    }
                   
                }
            }
            
        }
    }
   