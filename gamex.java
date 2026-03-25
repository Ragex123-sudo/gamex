import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import java.util.Scanner;
public class gamex
{
    public static void main(String args[])
    {
        String prompt;
        String prompt1="gg_cmd";
        Scanner sc_1=new Scanner(System.in);
        System.out.println("-----  |---|  |- -|  |---  -   -");
        System.out.println("|  _   |___|  | | |  |---    x  ");
        System.out.println("|_| |  |   |  |   |  |---  -   -");
        System.out.println("To play number guessing game type gg_cmd");
        System.out.println("Enter the prompt");
        prompt=sc_1.nextLine();
        if(prompt.equals(prompt1))
        {
            int number;
            int rep=1;
            while(rep!=0)
            {
            System.out.println("Guess a random number between 100 and 500");
            System.out.println("Enter your number:");
            number=sc_1.nextInt();
            int min = 10;
                         int max = 50;
                         int randomNumber = (int)(Math.random() * (max - min + 1)) + min;
                        // Formula for a general range
            if(number==randomNumber)
            {
                System.out.println("Congratulations you win");
                System.out.println("press 0 to leave");
                System.out.println("press 1 to continue");
                rep=sc_1.nextInt();
            }
            else
            {
                System.out.println("oh no you lost");
                System.out.println("press 0 to leave");
                System.out.println("press 1 to continue");
                rep=sc_1.nextInt();
            }
        }
        }
    }
}