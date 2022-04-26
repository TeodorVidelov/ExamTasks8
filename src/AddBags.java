import java.util.Scanner;
public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfLuggageOver20Kg = Double.parseDouble(scanner.nextLine());
        double kgOfLuggage = Double.parseDouble(scanner.nextLine());
        int countOfDaysToTravel = Integer.parseInt(scanner.nextLine());
        int countOfLuggage = Integer.parseInt(scanner.nextLine());

        double price = 0;

            if (kgOfLuggage < 10)
            {
                price = priceOfLuggageOver20Kg * 0.20;
            }
            else if (kgOfLuggage <= 20 && kgOfLuggage >= 10)
            {
                price = priceOfLuggageOver20Kg * 0.50;
            }
            else if (kgOfLuggage > 20)
            {
                price = priceOfLuggageOver20Kg;
            }

        if (countOfDaysToTravel < 7)
        {
            price *= 1.40;
        }
        else if (countOfDaysToTravel <= 30  && countOfDaysToTravel >= 7)
        {
            price *= 1.15;
        }
        else if (countOfDaysToTravel > 30)
        {
            price *= 1.10;
        }
        System.out.printf("The total price of bags is: %.2f lv.",price * countOfLuggage);
    }
}