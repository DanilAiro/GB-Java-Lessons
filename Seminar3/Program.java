package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/**
 * Program
 */
public class Program {
  public static void main(String[] args) {
    // Заполнить список названиями планет Солнечной системы в произвольном порядке с
    // повторениями. Вывести название каждой планеты и количество его повторений в
    // списке.

    // ArrayList<String> al = new ArrayList<String>(
    // Arrays.asList("Земля", "Марс", "Уран", "Земля", "Марс", "Марс", "Уран",
    // "Земля"));
    // ArrayList<String> planets = new ArrayList<String>(
    // Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн",
    // "Уран", "Нептун"));
    // int counter = 0;

    // for (String s : planets) {
    // counter = Collections.frequency(al, s);
    // // counter = 0;
    // // for (String str : al) {
    // // if (s.equals(str)) {
    // // counter++;
    // // }
    // // }
    // if (counter > 0)
    // System.out.printf("%s: %d\n", s, counter);
    // }

    // Создать список типа ArrayList. Поместить в него как строки, так и целые
    // числа.
    // Пройти по списку, найти и удалить целые числа.

    //   ArrayList al = new ArrayList<>(Arrays.asList("Уран", "Земля", 10, 223, "Марс", "Марс", "Уран", 10, 223, 4324, 242));
    //   // for (int i = 0; i < al.size(); i++) {
    //   // if (al.get(i) instanceof Integer) {
    //   // al.remove(i);
    //   // i--;
    //   // }
    //   // }

    //   Iterator iter = al.iterator();

    //   while (iter.hasNext()) {
    //     if (iter.next() instanceof Integer) {
    //       iter.remove();
    //     }
    //   }

    //   System.out.println(al);
    // }

    // Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    ArrayList<Integer> ints = new ArrayList<>();
    Random rnd = new Random();

    for (int i = 0; i < 10; i++) {
      ints.add(rnd.nextInt(1000));
    }
    ints.sort(Comparator.reverseOrder());
    System.out.println(ints);
  }
}
