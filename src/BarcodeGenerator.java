import java.util.Scanner;
public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstFourDigitNumber = Integer.parseInt(scanner.nextLine());
        int secondFourDigitNumber = Integer.parseInt(scanner.nextLine());

        int firstNumberOfThousands = firstFourDigitNumber / 1000;
        int firstNumberOfHundreds = (firstFourDigitNumber / 100) % 10;
        int firstNumberOfTens = (firstFourDigitNumber / 10) % 10;
        int firstNumberOfSingles = firstFourDigitNumber % 10;

        int secondNumberOfThousands = secondFourDigitNumber / 1000;
        int secondNumberOfHundreds = (secondFourDigitNumber / 100) % 10;
        int secondNumberOfTens = (secondFourDigitNumber / 10) % 10;
        int secondNumberOfSingles = secondFourDigitNumber % 10;

        for (int i = firstNumberOfThousands; i <= secondNumberOfThousands; i++)
        {
            for (int j = firstNumberOfHundreds; j <= secondNumberOfHundreds; j++)
            {
                for (int k = firstNumberOfTens; k <= secondNumberOfTens; k++)
                {
                    for (int l = firstNumberOfSingles; l <= secondNumberOfSingles; l++)
                    {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0)
                        {
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}