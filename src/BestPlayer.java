import java.util.Scanner;
public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int bestPlayerGoals = Integer.MIN_VALUE;
        String bestPlayerName = "";
        
        while (!"END".equals(input))
        {
            String playerName = input;
            int countOfGoals = Integer.parseInt(scanner.nextLine());

            if (countOfGoals > bestPlayerGoals)
            {
                bestPlayerGoals = countOfGoals;
                bestPlayerName = playerName;
            }
            if (countOfGoals >= 10)
            {
                break;
            }
            input = scanner.nextLine();
        }
            System.out.printf("%s is the best player!\n", bestPlayerName);

        if (bestPlayerGoals >= 3)
        {
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestPlayerGoals);
        }
        else
        {
            System.out.printf("He has scored %d goals.",bestPlayerGoals);
        }
    }
}