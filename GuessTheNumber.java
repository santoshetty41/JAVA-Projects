import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Random;

class game
{
    int number;
    int guessTime = 0;

    game()
    {
        Random rand = new Random();
        number = rand.nextInt(100);
    }
    static int  takeNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess Your Number : ");
        int guessNo = sc.nextInt();
        return guessNo;
    }
     boolean checkNumber()
    {
        guessTime++;
        int guessNo = takeNumber();

        if(number == guessNo)
        {
            System.out.format("Yes You guessed it right , it was %d \n You guess it in %d Attemps" ,number, guessTime);
            return true;
        }
        else if(number < guessNo)
        {
            System.out.println("You Guess Greater Number !");
            System.out.println();
        }else if(number > guessNo)
        {
            System.out.println("You Guess Smaller Number !");
            System.out.println();
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args)
    {
        int num;
        game g = new game();
        boolean check = false;
        while(!check)
        {
           check = g.checkNumber();
        }

    }
}

