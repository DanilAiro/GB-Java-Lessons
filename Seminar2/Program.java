package Seminar2;

import java.io.FileWriter;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    // Задача 1. Дано четное число N (>0) и символы c1 и c2. Написать метод, который
    // вернет
    // строку длины N,
    // которая состоит из чередующихся символов c1 и c2, начиная с c1.

    Scanner sc = new Scanner(System.in);
    // System.out.print("Введите чётное положительно число: ");
    // int N = sc.nextInt();
    // // sc.nextLine();
    // System.out.print("Введите первый символ: ");
    // char c1 = sc.next().charAt(0);
    // // sc.nextLine();
    // System.out.print("Введите второй символ: ");
    // char c2 = sc.next().charAt(0);
    // // sc.nextLine();
    // StringBuilder sb = new StringBuilder();
    // // String sb = "";

    // for (int i = 0; i < N / 2; i++) {
    // sb.append(c1).append(c2);

    // // sb += c1;
    // // sb += c2;
    // }
    // System.out.println(sb);

    // Задание 2. Напишите метод, который сжимает строку.
    // Ввод: aaaabbbcdd.
    // Вывод: a4b3cd2

    // System.out.print("Введите строку: ");
    // String str = sc.nextLine();
    // getShorty(str);

    int n = 10;
    String text = "TEST";

    try {
      FileWriter file = new FileWriter("test.txt", false);
      for (int i = 0; i < n; i++) {
        file.write(text);
        file.write("\n");
      }
      file.close();
      System.out.println("Получилось");
    }
    catch (Exception e) {
      System.out.println("Что-то пошло не так");
    }
  }

  public static void getShorty(String str) {
    str = str.concat("/");
    int counter = 1;
    char temp = str.charAt(0);

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == temp) {
        counter++;
      } else {
        if (counter == 1) {
          System.out.printf("%c", temp);
        } else {
          System.out.printf("%c%d", temp, counter);
        }
        temp = str.charAt(i);
        counter = 1;
      }
    }

    // if (counter == 1) {
    //   System.out.printf("%c", temp);
    // } else {
    //   System.out.printf("%c%d", temp, counter);
    // }
  }
}
