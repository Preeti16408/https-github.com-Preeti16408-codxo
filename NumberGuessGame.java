import java.util.Scanner;

public class NumberGuessGame {
    public static void guessnumber()
    {
        int number = 1+(int)(1000*Math.random());
        int K = 5;
        int i , guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("A number can be choosen from 1 to 1000 withing 5 trial");
        for(i = 0; i <=5; i ++)
        {
            System.out.println("Guess the Number");
            guess = sc.nextInt();
            if(number == guess)
            {
            System.out.println("Congrats you guess the number");
            break;    
            }
           else if(number > guess && i !=K-1)
            {
            System.out.println("The number is too High Guess again");
            }
            else if(number < guess && i !=K-1)
            {
            System.out.println("The number is too Low Guess again");
            }
        }
         if(i==K)
         {
            System.out.println("Oops! You have exhausted te trails");
            System.out.println("The Number was : "+number);
         }   
        }
public static void main(String arg[])
{
    guessnumber(); 
}

        
    }

