package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Program {
  public static void main(String[] args) {
    /*
     * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
     * организации.
     * 
     * 123456 Иванов
     * 
     * 321456 Васильев
     * 
     * 234561 Петрова
     * 
     * 234432 Иванов
     * 
     * 654321 Петрова
     * 
     * 345678 Иванов
     * 
     * Вывести данные по сотрудникам с фамилией Иванов.
     */

    // Map<Integer, String> passMap = new HashMap<>();
    // passMap.put(123456, "Иванов");
    // passMap.put(321456, "Васильев");
    // passMap.put(234561, "Петрова");
    // passMap.put(234432, "Иванов");
    // passMap.put(654321, "Петрова");
    // passMap.put(345678, "Иванов");

    // for (var item : passMap.entrySet()) {
    // if (item.getValue().equals("Иванов")) {
    // System.out.println(item);
    // }
    // }

    /*
     * Даны 2 строки, написать метод, который вернет true, если эти строки являются
     * изоморфными и false, если нет.
     * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
     * букву во втором слове, при этом
     * 
     * 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с
     * сохранением порядка следования.
     * (Например, add - egg изоморфны)
     * 2. буква может не меняться, а остаться такой же. (Например, note - code) n:c,
     * o:o, t:d, e:e
     * 
     * Пример 1:
     * Input: s = "foo", t = "bar" f: b, o:a, -- false
     * Output: false
     * 
     * Пример 2:
     * Input: s = "paper", t = "title" p:t, a:i, e:l, r:e
     * Output: true
     */
    // System.out.println(checkIsomorf("add", "egg"));
    // System.out.println(checkIsomorf("note", "code"));
    // System.out.println(checkIsomorf("foo", "bar"));
    // System.out.println(checkIsomorf("paper", "title"));

    /*
     * Написать программу, определяющую правильность расстановки скобок в выражении.
     * Пример 1: a+(d*3) - истина
     * Пример 2: [a+(1*3) - ложь
     * Пример 3: [6+(3*3)] - истина
     * Пример 4: {a}[+]{(d*3)} - истина
     * Пример 5: <{a}+{(d*3)}> - истина
     * Пример 6: {a+]}{(d*3)} - ложь
     */

    String str = "{a}+{(d*3)}>";
    System.out.println(checkSkobki(str));
  }

  public static boolean checkIsomorf(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }

    Map<Character, Character> db = new HashMap<>();
    for (int i = 0; i < word1.length(); i++) {
      if (db.containsKey(word1.charAt(i))) {
        if (word2.charAt(i) != db.get(word1.charAt(i))) {
          return false;
        }
      } else {
        db.put(word1.charAt(i), word2.charAt(i));
      }
    }
    System.out.println(db);
    return true;
  }

  public static boolean checkSkobki(String str) {
    Map<Character, Character> dict = new HashMap<>();
    dict.put('}', '{');
    dict.put(']', '[');
    dict.put(')', '(');
    dict.put('>', '<');

    Stack<Character> st = new Stack<>();
    for (Character ch : str.toCharArray()) {
      if (dict.containsValue(ch)) {
        st.push(ch);
      } else if (dict.containsKey(ch)) {
        if (st.isEmpty() || st.pop() != dict.get(ch)) {
          return false;
        }
      }
    }
    return st.isEmpty();
  }
}
