package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Labs {
  
  public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
          // great if you need to manipulate the String
		// 		a. Instantiate a new StringBuilder
      StringBuilder dailyChore = new StringBuilder("Please clean the bathroom");
      System.out.println(dailyChore);
      dailyChore.append(" and put away laundry.");
      System.out.println(dailyChore);
          
		//		b. Append the characters 0 through 9 to it separated by dashes Note:  make sure no dash appears at the end of the StringBuilder
      StringBuilder num = new StringBuilder();

      for (int i = 0; i < 10; i++) {
        num.append(i);
        if (i != 9) {
          num.append("-");
        }
      }

      System.out.println(num.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
    List<String> groceries = new ArrayList<String>();
   
		//		b. Add 5 Strings to it, each with a different length
    groceries.add("milk");
    groceries.add("butter");
    groceries.add("eggs");
    groceries.add("sugar");
    groceries.add("tea");

    //can write above code in 1 line - List<String> groceries = Array.asList("Milk", " Butter", "eggs");
		
		// 3. Write and test a method that takes a list of strings and returns the shortest string
      System.out.println(findSmallestString(groceries));

		
		// 4. Write and test a method that takes a list of strings and returns the list with the first and last element switched
      List<String> switched = switchFirstandLast(groceries);
      for (String string : switched) {
        System.out.println(string);
      }
		
		// 5. Write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other, separated by a comma
    System.out.println(combineStrings(switched));

		
		// 6. Write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list containing the second string parameter (i.e. like a search method)
    System.out.println("----------------------");
      List<String> searchResults = search(groceries, "eg");
      for (String result  : searchResults) {
        System.out.println(result);
      }
		
		// 7. Write and test a method that takes a list of integers and returns a List<List<Integer>> with the following conditions specified for the return value:
		//		a. The first List in the returned value contains any number from the input list that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);

      List<List<Integer>> sortedNumbers =  sortDivisableNumbers(numbers);

      for (List<Integer> list : sortedNumbers) {
        for (Integer number : list) {
          System.out.println(number);
        }
        System.out.println("Next List ----------");
      }
		
		// 8. Write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
      List<Integer> stringsLengths = calculateStringLengthIntegers(groceries);
      for (Integer i : stringsLengths) {
        System.out.println(i);
      }

		
		// 9. Create a set of strings and add 5 values

		Set<String> set = new HashSet<String>();
    set.add("Hey");
    set.add("Hi");
    set.add("Hello");
    set.add("Aloha");
    set.add("Howdy");
		
		// 10. Write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the input set that start with the character parameter.
      Set<String> startsWithH = beginWith(set, 'H');
      for (String word : startsWithH) {
        System.out.println(word);
      }

		
		// 11. Write and test a method that takes a set of strings and returns a list of the same strings
      List<String> resultList = convertString(set);

      for (String listString : resultList) {
        System.out.println(listString);
      }
		

		// 12. Write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
      Set<Integer> intSet = new HashSet<Integer>();
      intSet.add(7);
      intSet.add(9);
      intSet.add(2);
      intSet.add(8);

      Set<Integer> evens = returnEven(intSet);
      for (Integer number : evens) {
        System.out.println(number);
      }
		
		// 13. Create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
      Map<String, String> dictionary = new HashMap<String, String>();
      dictionary.put("Dog", "Woof");
      dictionary.put("Cat", "Meow");
      dictionary.put("Cow", "Moo");
      dictionary.put("Horse", "Neigh");
		
		// 14. Write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches the string parameter (i.e. like a language dictionary lookup)
      String value = lookupValue(dictionary, "Dog");
      System.out.println(value);
		
		// 15. Write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start with a given character
    Map<Character, Integer> counts = startingLetters(resultList);
    for (Character character : counts.keySet()) {
      System.out.println(character + " - " +counts.get(character));
    }


	}
	
	
	// Method 15:
	public static Map<Character, Integer> startingLetters(List<String> list) {
    Map<Character, Integer> results = new HashMap<Character, Integer>();

    for (String string : list) {
      char c = string.charAt(0);
      if (results.get(c) == null) {
        results.put(c, 1);
      } else {
        results.put(c, results.get(c) + 1);
      }
    }


    return results;
  }
	
	
	// Method 14:
	public static String lookupValue(Map<String, String> map, String string) {
    for (String key : map.keySet()) {
      if (key.equals(string)) {
        return map.get(key);
      }
    }
    return "";
  }

	
	// Method 12:
	public static Set<Integer> returnEven(Set<Integer> set) {
    Set<Integer> results = new HashSet<Integer>();
    for (Integer number : set) {
      if (number % 2 == 0) {
        results.add(number);
      }
    }
    return results;
  }

	
	// Method 11:
	public static List<String> convertString(Set<String> set) {
    List<String> results = new ArrayList<String>();

    for (String string : set) {
      results.add(string);
    }
    return results;
  }


	// Method 10:
	public static Set<String> beginWith(Set<String> set, char c) {
    Set<String> results = new HashSet<String>();

    for (String string : set) {
      if (string.charAt(0) == c) {
        results.add(string);
      }
    }
    return results;
  }

	
	// Method 8:
	public static List<Integer> calculateStringLengthIntegers(List<String> list) {
    List<Integer> lengths = new ArrayList<Integer>();
    for (String string : list) {
      lengths.add(string.length());
    }
    return lengths;
  }

	
	// Method 7:
	public static List<List<Integer>> sortDivisableNumbers(List<Integer> list) {
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    results.add(new ArrayList<Integer>());
    results.add(new ArrayList<Integer>());
    results.add(new ArrayList<Integer>());
    results.add(new ArrayList<Integer>());

    for (Integer number : list) {
      if (number % 2 == 0) {
        results.get(0).add(number);
      }
      if (number % 3 == 0) {
        results.get(1).add(number);
      }
      if (number % 5 == 0) {
        results.get(2).add(number);
      }
      if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
        results.get(3).add(number);
      }
    }
    return results;
  }

	
	// Method 6:
	public static List<String> search(List<String> list, String query) {
    List<String> results = new ArrayList<String>();
    for (String string : list) {
      if (string.contains(query)) {
        results.add(string);
      }
    }
    return results;
  }

	
	// Method 5:
  public static String combineStrings(List<String> strings) {
    StringBuilder result = new StringBuilder();
    for (String string : strings) {
      result.append(string + ", ");
    }
   return result.toString();
  }
	
	
	
	// Method 4:
	public static List<String> switchFirstandLast(List<String> groceries) {
    String ph = groceries.get(0);
    groceries.set(0, groceries.get(groceries.size() - 1));
    groceries.set(groceries.size() - 1, ph);
    return groceries;
  }
	
	
	// Method 3:
  public static String findSmallestString(List<String> groceries) {
    String smallest = groceries.get(0);
    for (String grocerie : groceries) {
      if (grocerie.length() < smallest.length()) {
        smallest = grocerie;
      }
    }
    return smallest;
  }

}
