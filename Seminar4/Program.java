package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.management.Query;

public class Program {
  public static void main(String[] args) {
    // 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
    // 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
    // Сравните с предыдущим.

    // ArrayList<Integer> al = new ArrayList<>();
    // long timeStart = System.currentTimeMillis();
    // for (int i = 0; i < 100000; i++) {
    // al.add(0, 0);
    // }
    // long timeStop = System.currentTimeMillis();
    // long res = timeStop - timeStart;
    // System.out.println(res);

    // LinkedList<Integer> ll = new LinkedList<>();
    // long timeStart2 = System.currentTimeMillis();
    // for (int i = 0; i < 100000; i++) {
    // ll.add(0, 0);
    // }
    // long timeStop2 = System.currentTimeMillis();
    // long res2 = timeStop2 - timeStart2;
    // System.out.println(res2);

    /*
     * 1. Принимает от пользователя строку вида
     * text
     * 
     * 1. Нужно сохранить text в связный список.
     * 2. Если введено print~num, выводит строку из позиции num в связном списке и
     * удаляет её из списка
     */

    // LinkedList<String> link = new LinkedList<>();
    // Scanner sc = new Scanner(System.in);
    // String text;
    // boolean isExit = false;

    // while (!isExit) {
    // text = sc.nextLine();

    // if (text.startsWith("print~", 0)) {
    // System.out.println(link.remove(Integer.parseInt(text.substring(6))));
    // } else if (text.equals("exit")) {
    // isExit = true;
    // } else {
    // link.add(text);
    // }
    // System.out.println(link);
    // }

    /*
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была
     * первой в списке, а первая - последней.
     */

    // Stack<String> st = new Stack<>();
    // Scanner sc = new Scanner(System.in);
    // String text;
    // boolean isExit = false;

    // while (!isExit) {
    // text = sc.nextLine();

    // if (text.startsWith("print", 0)) {
    // while (!st.empty()) {
    // System.out.print(st.pop() + " ");
    // }
    // } else if (text.equals("exit")) {
    // isExit = true;
    // } else {
    // st.push(text);
    // }
    // System.out.println();
    // System.out.println(st);
    // }

    /*
     * Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
     */
    int[] nums = new int[10];
    Random rnd = new Random();

    for (int i = 0; i < nums.length; i++) {
      nums[i] = rnd.nextInt(10);
      System.out.print(nums[i] + " ");
    }
    System.out.println();
    System.out.println(fillStack(nums));
    System.out.println(fillQueue(nums));
  }
  
  public static Stack<Integer> fillStack(int[] i) {
    Stack<Integer> st = new Stack<>();
    for (int num : i) {
      st.push(num);
    }
    return st;
  }
  
  public static Queue<Integer> fillQueue(int[] i) {
    Queue<Integer> qu = new LinkedList<>();
    for (int num : i) {
      qu.add(num);
    }
    return qu;
  }
}
