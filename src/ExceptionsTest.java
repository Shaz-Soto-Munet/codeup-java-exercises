public class ExceptionsTest {
    public static void main(String[] args) {
        try {
//            Exceptions study = new Exceptions();
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(Integer.parseInt(study.certainlyNotAnInteger));

            String name = "Shaz";
//            System.out.println(name.length());
            String nameFirstTwoChars = name.substring(5);
        } catch (StringIndexOutOfBoundsException error) {
//            System.out.println("Got an exception: " + nfx);
//            System.out.println(error.getMessage());
        }

    }
}
