package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    /*
     * Object - всему голова
     * Упаковка - любой тип можно положить в переменную типа Object
     * Распаковка - преобразование Object-переменной в нужный тип
     * Иерархия типов - любой тип "ниже" Object'a
     */

    Object o = 1;
    getType(o);
    o = 1.2;
    getType(o);

    System.out.println(Sum(1, 2));
    System.out.println(Sum(1.0, 2));
    System.out.println(Sum(1, 2.0));
    System.out.println(Sum(1.2, 2.1));

    int[] a = new int[] { 1, 9 };
    int[] b = new int[3];
    System.arraycopy(a, 0, b, 0, a.length);

    for (int i : a) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    for (int i : b) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    
    a = addItem(a, 2);
    a = addItem(a, 3);
    for (int i : a) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    
    /*
     * List - пронумерованный набор элементов
     * 
     * ArrayList, LinkedList (Vector, Stack - устаревшие)
     * 
     * add(args) - добавляет элемент в список(в т.ч. на нужную позицию)
     * get(pos) - возвращает элемент из списка по указанной позиции
     * indexOf(itam) - первое вхождение или -1
     * lastIndexOf(item) - последнее вхождение или -1
     * remove(pos) - удаление элемента на указанной позиции и его возвращение
     * set(int pos, T item) - помещфет значение item элементу, находится на позиции pos
     * void sort(Comparator) - сортирует набор данных по правилу
     * subList(int start, int end) - получение набора данных в пределах
     */

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(2809);

    for (Object obj : list) {
      System.out.println(obj);
    }

    int day = 29;
    int month = 9;
    int year = 1990;
    Integer[] date = { day, month, year };
    List<Integer> d = Arrays.asList(date);
    System.out.println(d);

    StringBuilder day1 = new StringBuilder("29");
    StringBuilder month1 = new StringBuilder("9");
    StringBuilder year1 = new StringBuilder("1990");
    StringBuilder[] date1 = new StringBuilder[] { day1, month1, year1 };
    List<StringBuilder> d1 = Arrays.asList(date1);
    System.out.println(d1);
    date1[1] = new StringBuilder("09");
    System.out.println(d1);

    /*
     * clear() - очистка списка
     * toString() - "конвертация" списка в строку
     * Arrays.asList() - преобразует массив в список
     * containsAll(col) - проверяет включение всех элементов из col
     * removeAll(col) - удаляет элементы, имеющиеся в col
     * retainAll(col) - оставляет элементы, имеющиеся в col
     * toArray() - конвертация списка в массив Object'ов
     * toArray(type array) - конвертация списка в массив type
     * List.copyOf(col) - возвращает копию списка на основе имеющегося
     * List.of(item1, item2, ...) - возвращает неизменяемый список
     */

    // Character value = null;
    // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
    // System.out.println(list1);
    // list1.remove(1);
    // List<Character> list2 = List.copyOf(list1);

    List<Character> list3 = new ArrayList<Character>();
    list3.add('S');
    list3.add('e');
    list3.add('r');
    System.out.println(list3);
    list3.remove(1);
    System.out.println(list3);
    List<Character> list4 = List.copyOf(list3);

    List<Integer> list5 = List.of(1, 12, 123, 1234, 12345);

    for (int item : list5) {
      System.out.println(item);
    }

    Iterator<Integer> col = list5.iterator();
    System.out.println();

    while (col.hasNext()) {
      System.out.println(col.next());
      // col.next();
      // col.remove();
    }
  } 

  static void getType(Object obj) {
    System.out.println(obj.getClass().getName());
  }

  static Object Sum(Object a, Object b) {
    if (a instanceof Double && b instanceof Double) {
      return (Object) ((Double) a + (Double) b);
    } else if (a instanceof Integer && b instanceof Integer) {
      return (Object) ((Integer) a + (Integer) b);
    } else {
      return 0;
    }
  }

  static int[] addItem(int[] array, int item) {
    int[] temp = new int[array.length + 1];
    System.arraycopy(array, 0, temp, 0, array.length);
    temp[array.length] = item;
    return temp;
  }
}
