import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsLecture {

    public static void main(String[] args) {
//        ArrayList<Monster> monsterList = new ArrayList<>();
//
//        Monster orc = new Monster("Orc", 13, 15, 9);
//        monsterList.add(orc);
//        System.out.println(monsterList.size());
//        Monster ogre = new Monster("Ogre", 11, 59, 13);
//        monsterList.add(ogre);
//        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
//        monsterList.add(blueDragon);
//        System.out.println(monsterList.size());
//        System.out.println(blueDragon);
//        System.out.println(monsterList);

//        monsterList.remove(blueDragon);
//        System.out.println(monsterList.size());
//        monsterList.remove(1);
//        System.out.println(monsterList.size());

//        for (int i = 0; i < monsterList.size(); i++){
//            String name = monsterList.get(i).getName();
//            int damage = monsterList.get(i).getDamage();
//            int hitPoints = monsterList.get(i).getHitPoints();
//            System.out.printf("The %s does %d damage and has %d hit points%n", name, damage, hitPoints );
//        }

//        for(Monster monster : monsterList){
//            System.out.println("The " + monster.getName() + " has " + monster.getHitPoints() + " hit points and does " + monster.getDamage() + " points of damage when it attacks.");
//        }

//    ArrayList<Integer> myNumbers = new ArrayList<>();
//        myNumbers.add(42);
//        myNumbers.add(56);
//        myNumbers.add(43);
//        System.out.println(myNumbers.get(1));
//        System.out.println(myNumbers);
//        Collections.sort(myNumbers);
//        System.out.println(myNumbers);
//
//        ArrayList<Person> persons = new ArrayList<>();
//        Person joe = new Person("Joe");
//        Person mo = new Person("Mo");
//        Person zahra = new Person("Zahra");
//        persons.add(joe);
//        persons.add(mo);
//        persons.add(zahra);
//        for (Person person : persons){
//            System.out.println(person.getName());
//        }


        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Gregg Popovich", 1341);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        System.out.println(careerWins.get("Gregg Popovich"));
        System.out.println(careerWins);

        careerWins.replace("Gregg Popovich", 1342);
        System.out.println(careerWins);
        System.out.println(careerWins.get("Lenny Wilkens"));

        for (Map.Entry<String, Integer> careerWinsEntry : careerWins.entrySet()){
            System.out.println(careerWinsEntry.getKey() + " : " + careerWinsEntry.getValue());
        }

    }
}