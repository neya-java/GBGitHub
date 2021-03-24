import java.util.*;

public class Main{

    public static void main(String[] args)   {
        List<String> al = new ArrayList<>(20);
        al.addAll(Arrays.asList( "Машина", "Трактор", "Мотоцикл", "Мопед", "Велосипед", "Самокат", "Трактор",
                "Телега", "Снегоход", "Велосипед", "Трактор"));
        System.out.println("Вся коллекция: " );
        System.out.println(al);
        System.out.println();

        HashMap<String, Integer> hm = new HashMap<>();
        Integer value;
        for (String t:al) {
            value = hm.get(t);        //передаем значение из al как ключ и получаем значение
            if (value == null) {              // если значение null то присваиваем ему 1 иначе делаем его +1
//                System.out.println(value+ ","+hm.get(t));
                hm.put(t, 1);
            } else
                hm.put(t, value+1);
        }
        System.out.println("Сколько раз встречаются слова: ");
        System.out.println(hm);
        System.out.println();

        Set<String> st = new HashSet<>(Arrays.asList("Машина", "Трактор", "Мотоцикл", "Мопед", "Велосипед", "Самокат", "Трактор",
                "Телега", "Снегоход", "Велосипед"));
        System.out.println("Уникальные слова: " );
        System.out.println(st);
        System.out.println();

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Арлашкин", 89273604420L);
        phoneDirectory.add("Арлашкин", 89273604421L);
        phoneDirectory.add("Иванов", 89273600000L);
        phoneDirectory.add("Петров", 89273600001L);
        phoneDirectory.add("Сидоров", 8927360002L);
        System.out.println(phoneDirectory.phoneDirectory);

        phoneDirectory.get("Иванов");
        phoneDirectory.get("Арлашкин");


    }
}