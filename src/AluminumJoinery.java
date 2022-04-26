import java.util.Scanner;
public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfJoinery = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String typeDelivery = scanner.nextLine();

        double price = 0;

        if ("90X130".equals(typeOfJoinery))
        {
                price = 110 * countOfJoinery;
                if (countOfJoinery > 30 && countOfJoinery < 60)
                {
                    price *= 0.95;
                }
                else if (countOfJoinery > 60)
                {
                    price *= 0.92;
                }
        }
        if ("100X150".equals(typeOfJoinery))
        {
            price = 140 * countOfJoinery;
            if (countOfJoinery > 40 && countOfJoinery < 80)
            {
                price *= 0.94;
            }
            else if (countOfJoinery > 80)
            {
                price *= 0.90;
            }
        }
        if ("130X180".equals(typeOfJoinery))
        {
            price = 190 * countOfJoinery;
            if (countOfJoinery > 20 && countOfJoinery < 50)
            {
                price *= 0.93;
            }
            else if (countOfJoinery > 50)
            {
                price *= 0.88;
            }
        }
        if ("200X300".equals(typeOfJoinery))
        {
            price = 250 * countOfJoinery;
            if (countOfJoinery > 25 && countOfJoinery < 50)
            {
                price *= 0.91;
            }
            else if (countOfJoinery > 50)
            {
                price *= 0.86;
            }
        }
        if ("With delivery".equals(typeDelivery))
        {
            price += 60;
        }
        if (countOfJoinery > 99)
        {
            price *= 0.96;
        }
        if (countOfJoinery < 10)
        {
            System.out.println("Invalid order");
        }
        else
        {
            System.out.printf("%.2f BGN", price);
        }
    }
}