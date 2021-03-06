package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(){}

    public Student(String name){
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public void setName(String name){
        this.name = name;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public int getGradeAverage(){
        int total = 0;
        for (Integer grade : grades){
            total += grade;
        }
        return total / grades.size();
    }

    public void showGrades(){
        System.out.println(grades);
    }
}
