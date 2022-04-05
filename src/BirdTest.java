public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
        cardinal.makeNoise();

        Duck mallard = new Duck();
        mallard.setName("Mallard Duck");
        mallard.makeNoise();

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.makeNoise();


    }

}