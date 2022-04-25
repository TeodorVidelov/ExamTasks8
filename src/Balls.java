import java.util.Scanner;
public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfBalls = Integer.parseInt(scanner.nextLine());

        int sumOfPoints = 0;
        int countRedBalls = 0;
        int countOrangeBalls = 0;
        int countYellowBalls = 0;
        int countWhiteBalls = 0;
        int countDevideBlackBalls = 0;
        int countOtherBalls = 0;

        for (int i = 0; i < countOfBalls; i++)
        {
            String colourOfBalls = scanner.nextLine();
            if ("red".equals(colourOfBalls))
            {
                sumOfPoints += 5;
                countRedBalls++;
            }
            else if ("orange".equals(colourOfBalls))
            {
                sumOfPoints += 10;
                countOrangeBalls++;
            }
            else if ("yellow".equals(colourOfBalls))
            {
                sumOfPoints += 15;
                countYellowBalls++;
            }
            else if ("white".equals(colourOfBalls))
            {
                sumOfPoints += 20;
                countWhiteBalls++;
            }
            else if ("black".equals(colourOfBalls))
            {
                Math.floor(sumOfPoints /= 2);
                countDevideBlackBalls++;
            }
            else
            {
                countOtherBalls++;
            }
        }
        System.out.printf("Total points: %d\n",sumOfPoints);
        System.out.printf("Red balls: %d\n",countRedBalls);
        System.out.printf("Orange balls: %d\n",countOrangeBalls);
        System.out.printf("Yellow balls: %d\n",countYellowBalls);
        System.out.printf("White balls: %d\n",countWhiteBalls);
        System.out.printf("Other colors picked: %d\n",countOtherBalls);
        System.out.printf("Divides from black balls: %d",countDevideBlackBalls);
    }
}