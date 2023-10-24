import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> citiesToLocation = new HashMap<>();
        citiesToLocation.put("London", "Greater London");
        citiesToLocation.put("Manchester", "Greater Manchester");
        citiesToLocation.put("Birmingham", "West Midlands");
        citiesToLocation.put("Liverpool", "Merseyside");
        citiesToLocation.put("Edinburgh", "Scotland");
        citiesToLocation.put("Belfast", "Ireland");
        citiesToLocation.put("Aberdeen", "Scotland");


        System.out.println(citiesToLocation);
        List<String> cities = new LinkedList<String>(citiesToLocation.keySet());
        Iterator<String> iterator = cities.iterator();
        List<String> newList = new ArrayList<>();

        newList.add(iterator.next());

        while (iterator.hasNext()) {
            String element = iterator.next();

            for (int i = 0; i < newList.size(); i++) {
                if (newList.get(i).compareTo(element) > 0) {
                    newList.add(i, element);
                    break;
                }
            }
            iterator.remove();

        }

        /*
        Easy way:
        Collections.sort(cities);
        while(iterator.hasNext()) {
           (print stuff)
        }
         */

        for (String city : newList) {
            System.out.println("City: " + city + " Location: " + citiesToLocation.get(city));
        }

    }

}
