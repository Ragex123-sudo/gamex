import java.util.Scanner;
public class gamex
{
    public static void main(String args[])
    {
        String green="\u001B[32m";
        String reset="\u001B[0m";
        String prompt;
        String prompt1="gg_cmd";
        String prompt2="length_cmd";
        Scanner sc_1=new Scanner(System.in);
        System.out.println(green+"-----  |---|  |- -|  |---  -   -"+reset);
        System.out.println(green+"|  _   |___|  | | |  |---    x  "+reset);
        System.out.println(green+"|_| |  |   |  |   |  |---  -   -"+reset);
        System.out.println("To play number guessing game type gg_cmd");
        System.out.println("To play word length game type length_cmd");
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
        if(prompt.equals(prompt2))
        {
          String input;
          int score=0;
          System.out.println("There will be 5 rounds for this game");
          for(int i=1;i<=5;i++)
          {
          int min=3;
          int max=10;
          int random_number=(int)(Math.random()*(max-min+1))+min;
          System.out.println("Enter a  word of length "+random_number);
          input=sc_1.nextLine();
          int length=input.length();
          if(length==random_number)
          {
            System.out.println("congrats you won!");
            score=score+1;
            input="";
            length=0;
          }
          else
          {
            System.out.println("oh no you loose");
          }
        }
        System.out.println("your score is "+score);
    }
}
}