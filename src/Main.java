import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String newName;
        Integer newAge;


        HashMap<Integer, ArrayList<User>> map = new HashMap<>();



        for (int i=0; i<5; i++) {

            System.out.println("Введите имя " + (i+1) + "-го пользователя");
            newName = in.nextLine();
            System.out.println("Введите возраст " + (i+1) + "-го пользователя");
            newAge = in.nextInt();
            in.nextLine(); // РЕШЕНИЕ ПРОБЛЕМЫ СО СЧИТЫВАНИЕМ

            User userTemp = new User(newName, newAge);

            if (map.containsKey(newAge)) {
                map.get(newAge).add(userTemp);
            }
            else {
                ArrayList<User> myArrayList = new ArrayList<>();
                myArrayList.add(userTemp);
                map.put(newAge, myArrayList);
            }
        }

        System.out.println("Введите требуемый возраст");
        newAge = in.nextInt();

        if (map.containsKey(newAge)) {

            int tamount = map.get(newAge).size();

            for (int i=0; i<tamount; i++) {
                System.out.println(map.get(newAge).get(i).toString());
            }
        }
        else {
            System.out.println("Пользователь с возрастом '" + newAge + "' не найден");
        }

//        Comparator sortAge = new AgeComporator();
//        myArrayList.sort(sortAge);
//
//        for (int i=0; i<5; i++) {
//            System.out.println(myArrayList.get(i).toString());
//        }


    }
}