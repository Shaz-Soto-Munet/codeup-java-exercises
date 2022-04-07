package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student shaz = new Student();
        shaz.setName("Shaz");
        shaz.addGrade(90);
        shaz.addGrade(100);
        shaz.addGrade(85);

        Student luis = new Student();
        luis.setName("Luis");
        luis.addGrade(80);
        luis.addGrade(80);
        luis.addGrade(90);

        Student andres = new Student();
        andres.setName("Andres");
        andres.addGrade(100);
        andres.addGrade(100);
        andres.addGrade(100);

        students.put("Shaz-Soto-Munet", shaz);
        students.put("Luisito", luis);
        students.put("Andresito", andres);

        System.out.println(students);

//        Set<String> gitHubUserNames = students.keySet();
//        for (String gitHubUserName : gitHubUserNames){
//            System.out.printf(" |%s| ", gitHubUserName);
//        }
    }

}
