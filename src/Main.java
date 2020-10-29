
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split("\\s+");
        double pricePerDay =  Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2]);
        Discount discount = Discount.valueOf(tokens[3]);
        System.out.printf("%.2f", PriceCalculator.calculatePrice(pricePerDay, days, season, discount));


    }
}








