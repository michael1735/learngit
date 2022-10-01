import java.util.Scanner;

public class DrinkingWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the number of bottles of water you initially buy: ");
        int numBottle = scan.nextInt();
        System.out.print("Please input the rate of exchange: ");
        int numExchange = scan.nextInt();
        int bottles = numBottle;

        while (bottles>= numExchange)
        {
            numBottle = numBottle + bottles / numExchange;
            bottles = bottles / numExchange + bottles % numExchange;
        }

        System.out.println("The number of bottles you drunk is " + numBottle);
    }
}
