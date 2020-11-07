import java.util.Map;

public class Modifiers {
    static Map<String,Double> wheatModifiers = Map.of("White",  1.5,
	                                            "Wholegrain" , 1.0);
    static Map<String,Double> techniqueModifiers = Map.of("Crispy",  0.9,
            "Chewy" , 1.1,
            "Homemade", 1.0);

    static Map<String,Double> toppingsModifiers = Map.of("Meat",  1.2,
            "Veggies" , 0.8,
            "Cheese", 1.1,
            "Sauce", 0.9);


}
