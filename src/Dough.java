public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {

            Validator.checkDoughWeight(weight);
            this.weight = weight;
    }

    private void setFlourType(String flourType) {

            Validator.checkFlourType(flourType);
            this.flourType = flourType;

    }


    private void setBakingTechnique(String bakingTechnique) {

            Validator.checkBackingTechnique(bakingTechnique);
            this.bakingTechnique = bakingTechnique;

    }
    public double calculateCalories(){
        return 2*this.weight*Modifiers.wheatModifiers.get(this.flourType)
                *Modifiers.techniqueModifiers.get(this.bakingTechnique);
    }
}
