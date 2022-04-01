class DishTools{
    static final int AVG_COST_OF_DISH_IN_CENTS = 13000;

    public static void shoutDishName(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }
    public static void analyzeDishCost(Dish dish){
        if (dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average.");
        } else {
            System.out.println("Less expensive than average.");
        }
    }
}

class Dish{
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("Cost: %d cents \nName: %s \nRecommended: %b \n", costInCents, nameOfDish, wouldRecommend);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish(){
        return nameOfDish;
    }

    public boolean getWouldRecommend(){
        return wouldRecommend;
    }

    public void setCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}

public class OOPMiniAssingment {
    public static void main(String[] args) {
        Dish dish1 = new Dish(
                1500,
                "Pepperoni Pizza",
                false
        );

        Dish dish2 = new Dish(
                15000,
                "Lobster Plate",
                true
        );

        dish1.setNameOfDish("Supreme Pizza");

        dish1.printSummary();

        DishTools.analyzeDishCost(dish1);
        DishTools.analyzeDishCost(dish2);
    }
}
