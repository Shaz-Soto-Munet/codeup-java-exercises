public class JavaWarmups {
    public static void main(String[] args) {
        System.out.println(returnFirstCapitalLetter("hellO"));
    }

    public static char returnFirstCapitalLetter (String string){
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i) == Character.toUpperCase(string.charAt(i))){
                return string.charAt(i);
            }
        }
        return ' ';
    }
}
