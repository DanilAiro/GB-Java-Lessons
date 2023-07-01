package Seminar6;

import java.sql.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Program {
    // public static void main(String[] args) {
    // int[] arr = new int[100];
    // fillArray(arr);
    // System.out.printf("%.2f", uniqNumbers(arr));
    // System.out.println();
    // }

    // public static void fillArray(int[] arr) {
    // Random rnd = new Random();
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = rnd.nextInt(51);
    // }
    // }

    // public static void printArray(int[] arr) {
    // for (int i : arr) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }

    // public static double uniqNumbers(int[] arr) {
    // Set<Integer> set = new HashSet<>();
    // for (int i : arr) {
    // set.add(i);
    // }
    // return (float) set.size() * 100 / arr.length;
    // }

    public static void main(String[] args) {
        // Cat cat1 = new Cat();
        // cat1.id = 1;
        // cat1.name = "Лето";
        // cat1.sex = Sex.M;
        // cat1.age = 4;
        // cat1.birthday = Date.valueOf("2020-10-02");
        // cat1.sterialized = false;
        // cat1.poroda = Poroda.Krasavec;

        Cat cat2 = new Cat("Лето", 4, Poroda.Krasavec);
        Cat cat3 = new Cat("Мышь", 4);

        System.out.println(cat2);
        
        cat2.privivka();

        System.out.println(cat2.toString());

        cat3.meow();
    }

}
