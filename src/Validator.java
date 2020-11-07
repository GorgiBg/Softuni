public class Validator {
    public static void checkFlourType(String flour){
        if (!Modifiers.wheatModifiers.containsKey(flour)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    public static void checkBackingTechnique(String technique){
        if (!Modifiers.techniqueModifiers.containsKey(technique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    public static void checkDoughWeight(double weight){
        if (weight<1 || weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }
    public static void checkToppingType(String name){
        if (!Modifiers.toppingsModifiers.containsKey(name)){
            throw new IllegalArgumentException("Cannot place "+name+" on top of your pizza.");
        }
    }
    public static void checkToppingWeight(String name, double weight){
        if (weight<1 || weight>50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",
                    name));
        }
    }
    public static void checkPizzaName(String name){
        if (name == null || name.trim().isEmpty() || name.length()<1 || name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }
    public static void checkNumberOfToppings(int number){
        if (number<0 || number>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

}
