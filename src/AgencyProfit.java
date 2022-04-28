import java.util.Scanner;
public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int countAdultTickets = Integer.parseInt(scanner.nextLine());
        int countChildrenTickets = Integer.parseInt(scanner.nextLine());
        double netWorthAdultTicket = Double.parseDouble(scanner.nextLine());
        double taxService = Double.parseDouble(scanner.nextLine());

        double netWorthChildrenTicket = netWorthAdultTicket * 0.30;
        double priceAdultTicket = netWorthAdultTicket + taxService;
        double priceChildrenTicket = netWorthChildrenTicket + taxService;
        double totalPrice = priceAdultTicket * countAdultTickets + priceChildrenTicket * countChildrenTickets;
        double agencyProfit = totalPrice * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airlineName,agencyProfit);
    }
}