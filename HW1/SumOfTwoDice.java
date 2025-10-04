import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println(dice1 + dice2);
    }
}
