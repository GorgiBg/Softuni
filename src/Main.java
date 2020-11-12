import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Vehicle> vehicles = new HashMap<>();
        String[] carInfo = sc.nextLine().split("\\s+");
        vehicles.putIfAbsent("Car", new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2])));
        String[] truckInfo = sc.nextLine().split("\\s+");
        vehicles.putIfAbsent("Truck", new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2])));
        int n = Integer.parseInt(sc.nextLine());
        while (n-->0){
            String[] tokens = sc.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            Double value = Double.parseDouble(tokens[2]);
            switch (command){
                case "Drive":
                    System.out.println(vehicles.get(type).drive(value));
                    break;
                case "Refuel":
                    vehicles.get(type).refuel(value);
                    break;
            }
        }
        for (Map.Entry<String, Vehicle> vehicle : vehicles.entrySet()) {
            System.out.println(vehicle.getValue().toString());
        }


    }
}

