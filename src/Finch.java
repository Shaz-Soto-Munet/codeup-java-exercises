public class Finch extends Bird{
    public Finch(){
        System.out.println("A finch just got created!");
    }

    public Finch(String name, boolean canItFly){
//        this.setName() = name;
//        this.setCanFly() = canItFly;
        super(name, canItFly);
    }
}
