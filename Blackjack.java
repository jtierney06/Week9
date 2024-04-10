import java.util.Random;
import java.util.Scanner;
public class Blackjack{
    public static void main(String[] args){
        Random rand = new Random();
        int int1 = rand.nextInt(10);
        int int2 = rand.nextInt(10);
        int sum = int1 + int2;
        System.out.println("You have a " + int1 + " and a " + int2 + " for a total of " + sum);
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want another card? ");
        String ans = input.nextLine();
        input.close();
        if(ans.equals("Yes")){
            int int3 = rand.nextInt(10);
            sum = int1 + int2 + int3;
            System.out.println("You have a " + int1 + " and a " + int2 + " and a " + int3 +" for a total of " + sum);        
        }
       
            int num1 = rand.nextInt(10);
            int num2 = rand.nextInt(10);
            int num3 = rand.nextInt(10);
            int sum2 = num1 + num2 + num3;
            System.out.println("The dealer has a " + num1 + " and a " + num2 + " and a " + num3 +" for a total of " + sum2);       
        
        if(sum > 21){
            System.out.println("Player Loses");
        } else if(sum2 > 21){
            System.out.println("Player Wins");
        } else if(sum > sum2){
            System.out.println("Player Wins");
        } else if(sum < sum2){
            System.out.println("Dealer Wins");
        }else{
            System.out.println("Tie");
        }

        
    

    }

    
}