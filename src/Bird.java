public class Bird {
    final String CLASS = "Aves";

    // what kind of bird is it?
    private String name;

    // can it fly?
    private boolean canFly;

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

    public Bird(){
        System.out.println("A bird just got created!");
    };

    public Bird(String nameOfThisBird, boolean canItFly){
        this.name = nameOfThisBird;
        this.canFly = canItFly;
    }


}