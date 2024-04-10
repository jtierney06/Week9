import java.util.Random;
import java.util.Scanner;
public class Blackjack{
    public static void main(String[] args){
        Random rand = new Random();
        int int1 = rand.nextInt(10);
        int int2 = rand.nextInt(10);
        int sum = int1 + int2;
        System.out.println("You have a " + int1 + " and a " + int2 + " for a total of " + sum);

    }
}