import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;


    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        Validator.checkPizzaName(name);
            this.name = name;


    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int count) {
        Validator.checkNumberOfToppings(count);
            this.toppings = new ArrayList<>(count);


    }

    public String getName() {
        return name;
    }
    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories(){
        double sum = 0;
        sum+=this.dough.calculateCalories();
        for (Topping topping : this.toppings) {
            sum+=topping.calculateCalories();
        }
        return sum;
    }
}
