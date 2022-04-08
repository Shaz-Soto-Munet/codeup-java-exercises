public class PetDog extends Pet implements Companion{
    protected boolean trained;

    public PetDog(){}

    public PetDog(boolean trained) {
        this.trained = trained;
    }

    public PetDog(String name, boolean trained) {
        super(name);
        this.trained = trained;
    }

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public boolean isTrained(){
        return trained;
    }

    public String snuggle(){
        return this.name + " wants to snuggle";
    }
}
