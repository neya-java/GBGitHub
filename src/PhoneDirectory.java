import java.util.*;


public class PhoneDirectory {
    HashMap<String, List<Long>> phoneDirectory = new HashMap<>();

    public void add(String name, Long tel){
        List<Long> allTelUser= phoneDirectory.getOrDefault(name, new ArrayList<>());
        allTelUser.add(tel);
        phoneDirectory.put(name, allTelUser);
    }

    public void get(String name) {
        System.out.println(name + ": " + phoneDirectory.get(name));
    }








}
