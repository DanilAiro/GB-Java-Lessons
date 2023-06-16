package Seminar1;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in, "cp866");
    // System.out.print("Введите имя пользователя: ");
    // String name = sc.nextLine();
    // System.out.printf("Привет, %s!", name);

    // // Задача 2. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
    // // максимальное количество подряд идущих 1.
    // int[] arr = new int[] { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
    // int count = 0;
    // int max = 0;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 1) {
    // count++;
    // } else if (arr[i] == 0) {
    // if (count > max)
    // max = count;
    // count = 0;
    // }
    // }

    // if (count > max)
    // max = count;

    // System.out.println(max);

    // Дан массив nums = [3,2,4,3,1,5,3,3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
    // конец массива.
    // Таким образом, первые несколько (или все) элементов массива должны быть
    // отличны от заданного, а остальные - равны ему.
    // [2,4,1,5,3,3,3,3]
    // C использованием только 1 массив

    int[] nums = new int[] { 3, 3, 2, 4, 3, 3, 3, 1, 5, 3, 1, 5, 3, 3 };
    int val = 3;
    int count = 0;
    // int index = 0;

    // for (int i = 0; i < nums.length; i++) {
    //   if (nums[i] == val)
    //     count++;
    // }

    // for (int j = 0; j <= count; j++) {
    //   for (int i = 0; i < nums.length; i++) {
    //     if (nums[i] == val) {
    //       index = i;
    //     } else if (index != -1) {
    //       int temp = nums[i];
    //       nums[i] = nums[index];
    //       nums[index] = temp;
    //       index = i;
    //     }
    //   }
    //   index = -1;
    // }

    // for (int i = 0; i < nums.length; i++) {
    //   System.out.print(nums[i] + " ");
    // }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[count++] = nums[i];
      }
    }
    while (count < nums.length)
      nums[count++] = val;
    for (int i : nums) {
      System.out.print(i + " ");
    }
  }
}
