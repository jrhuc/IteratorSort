import java.util.*;

public class SimpleSolution {
    public static void main(String[] args) {
        HashMap<String, String> citiesToLocation = createMap();
        System.out.println(citiesToLocation);
        List<String> cities = new LinkedList<String>(citiesToLocation.keySet());
        Collections.sort(cities);
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            System.out.println("City: " + c + " Location: " + citiesToLocation.get(c));
        }


    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> citiesToLocation = new HashMap<>();
        citiesToLocation.put("London", "Greater London");
        citiesToLocation.put("Manchester", "Greater Manchester");
        citiesToLocation.put("Birmingham", "West Midlands");
        citiesToLocation.put("Liverpool", "Merseyside");
        citiesToLocation.put("Edinburgh", "Scotland");
        citiesToLocation.put("Belfast", "Ireland");
        citiesToLocation.put("Aberdeen", "Scotland");
        return citiesToLocation;
    }

}
