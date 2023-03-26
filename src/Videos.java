package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Videos {
  
  public static void main(String[] args) {
    
    //STRING vs StringBuilder
    String firstName = "Amanda";
    String lastName = "Dean";
    System.out.println(firstName + " " + lastName);

    String tripleHi = multiplyString("Hi", 3);
    System.out.println(tripleHi);

    firstName = firstName.concat(lastName);
    System.out.println(firstName);

    StringBuilder fullName = new StringBuilder("Dan");
    fullName.append(" Dean");
    System.out.println(fullName.toString());

    System.out.println(fullName.charAt(5));
    System.out.println(fullName.deleteCharAt(5));
    System.out.println(fullName.delete(1, 3)); //end number does not get deleted
    System.out.println(fullName.indexOf("an"));
    System.out.println(fullName.replace(2, 5, "Thomas"));
    System.out.println(fullName.reverse());

    //LISTS
    String[] cars = new String[3];
    cars[0] = "Camero";
    cars[1] = "F150";
    cars[2] = "Mustang";
    // cant modify. must know what index you need to change

    //List<E> list of E where E is the generic that will be replaced with the type
    //List<String> reads as ~List of Strings~
    List<String> sports = new ArrayList<String>();
    sports.add("Wrestling");
    sports.add("Soccer");
    sports.add("Football");
    sports.remove(1);
    
    for (int i = 0; i < sports.size(); i++) {
      System.out.println(sports.get(i));
    }

    for (String sport : sports) {
      System.out.println(sport);
    }

    List<Integer> numbers = new ArrayList<Integer>();
    numbers.isEmpty();

    //COLLECTIONS

    //List- Allows Duplicates -- allows null values -- keeps elements in the order you add them
    //common implementations: ArrayList *most common* -- LinkedList -- Vector
    List<String> students = new ArrayList<String>();
    students.add("Rob");
    students.add("Rob");
    students.add("Sam");
    students.add(null);

    for (String student : students) {
      System.out.println(student);
    }

    System.out.println(students.get(2));
    System.out.println(students.get(0));

    //Set -- no duplicates -- unordered lists -- allows null
    //common implementations: HashSet *mostcommon* -- LinkedHashSet -- TreeSet 
    Set<String> states = new HashSet<String>();
    states.add("Alabama");
    states.add("Alaska");
    states.add("Arizona");
    states.add("Arkansas");
    states.add("California");
    states.add("null");

    System.out.println(states.size());
    System.out.println(states.contains("Alabama"));
    if (states.contains("Alabama")) {
      states.remove("Alabama");
    }

    for (String state : states) {
      System.out.println(state);
    }

    //Map -- key value pairs (dictionary) -- values can be duplicate but not keys
    //common implementations: HashMap *most common* -- LinkedHashMap -- TreeMap -- Hashtable (t is not capital)
    //Map<K,V> K is the key, and V is the value
    Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
    racerPlacements.put(1, "Tommy");
    racerPlacements.put(2, "Sally");
    racerPlacements.put(3, "John");

    System.out.println(racerPlacements.get(1));

    racerPlacements.remove(1);


    Set<Integer> racerKeys = racerPlacements.keySet();
    for (Integer key : racerKeys) {
      System.out.println(key + ": " + racerPlacements.get(key));
    }

    Collection<String> racers = racerPlacements.values();
    for (String racer : racers) {
      System.out.println(racer);
    }

    Map<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("Augment", "To make something better or to increase it.");
    dictionary.put("Deminish", "To make or become less.");
    dictionary.put("Ostentatious", "Charcterized by vulgar or pretentious display.");




  }
  //String Builder Method
  public static String multiplyString(String str, int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < num; i++) {
      result.append(str);
    }
    return result.toString();
  }

  //Lists

}
