import java.util.Random;
public class Negatives {
    public static void main(String[] args){
        Random rand = new Random();
        int int1 = rand.nextInt(3 + 3) - 3;
        int int2 = rand.nextInt(3 + 3) - 3;
        int int3 = rand.nextInt(3 + 3) - 3;
        int int4 = rand.nextInt(3 + 3) - 3;
        int sum = int1 + int2 + int3 + int4;
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4);
        System.out.println(sum);

        if(sum < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Not Negative");
        }
    }
}
