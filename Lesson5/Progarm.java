package Lesson5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Progarm {
  public static void main(String[] args) {
    Map<Integer, String> db = new HashMap<>();
    db.putIfAbsent(1, "один");
    db.put(2, "два");
    db.put(null, "!null");
    System.out.println(db);
    System.out.println(db.get(44));
    db.remove(null);
    System.out.println(db);
    System.out.println(db.containsValue("один"));
    System.out.println(db.containsValue(1));
    System.out.println(db.containsKey("один"));
    System.out.println(db.containsKey(1));
    System.out.println(db.keySet());
    System.out.println(db.values());
    
    for (var item : db.entrySet()) {
      System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
    }

    Map<Integer, String> map1 = new HashMap<>();
    Map<Integer, String> map2 = new HashMap<>(9);
    Map<Integer, String> map3 = new HashMap<>(9, 1.0f);


    /*
     * TreeMap
     * 
     * descendingKeySet(V)
     * descendingMap()
     * tailMap()
     * headMap()
     * lastEntry()
     * firstEntry()
     */

    TreeMap<Integer, String> tMap = new TreeMap<>();

    Map<Integer, String> lHMap = new LinkedHashMap<>();
    
    Map<Integer, String> hTable = new Hashtable<>();

  }
}
