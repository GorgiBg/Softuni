public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        Validator.checkToppingType(toppingType);
            this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        Validator.checkToppingWeight(this.toppingType, weight);
            this.weight = weight;
    }
    public double calculateCalories(){
        return 2*this.weight*Modifiers.toppingsModifiers.get(this.toppingType);
    }
}
