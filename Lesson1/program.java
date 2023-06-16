import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class program {
  public static void main(String[] args) throws Exception {
    // System.out.println("world");

    char ch = '1';
    System.out.println(Character.isDigit(ch)); // проверка принадлежности к числам

    System.out.println(getType(ch)); // Character

    int a = 124_454_454;
    a++;
    System.out.println(Integer.MAX_VALUE);

    String s = "qwer";
    System.out.println(s.charAt(1)); // w

    int b = 123;
    b = b-- - --b;
    System.out.println(b);

    int[] arr = new int[10];
    arr[3] = 13;
    System.out.println(arr[3]);

    int[] aarrr[] = new int[3][5];
    for (int[] line : aarrr) {
      for (int item : line) {

        System.out.printf("%d ", item);
      }
    }

    System.out.println();

    int[][] aar = new int[3][5];
    for (int i = 0; i < aar.length; i++) {
      for (int j = 0; j < aar[i].length; j++) {
        System.out.printf("%d", aar[i][j]);
      }
      System.out.println();
    }

    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("name: ");
    // String name = iScanner.nextLine();
    // System.out.printf("Привет, %s!", name);
    // iScanner.close();

    Scanner iiScanner = new Scanner(System.in);
    System.out.printf("int: ");
    boolean flag = iiScanner.hasNextInt();
    System.out.println(flag);
    if (flag) {
      int i = iiScanner.nextInt();
      System.out.println(i);

    }
    iiScanner.close();

    int z = 1, y = 2;
    int c = z + y;
    String res = String.format("%d + %d = %d \n", z, y, c);
    System.out.printf("%d + %d = %d \n", z, y, c);
    System.out.println(res);

    /*
     * Виды спецификаторов
     * %d для вывода целочисленных значений
     * %x для вывода шестнадцатеричных чисел
     * %f для вывода чисел с плавающей точкой
     * %e для вывода чисел в экспоненциальной форме, 3.1415е+01
     * %с для вывода одиночного символа
     * %s для вывода строковых значений
     */

    float pi = 3.1415f;
    System.out.printf("%f\n", pi); // 3.141500
    System.out.printf("%.2f\n", pi); // 3.14
    System.out.printf("%.3f\n", pi); // 3.141
    System.out.printf("%e\n", pi); // 3.141500e+00
    System.out.printf("%.2e\n", pi); // 3.14e+00
    System.out.printf("%.3e\n", pi); // 3.141e+00

    int p = 11;

    {
      int v = 222;
      System.out.println(v + p);
    }

    int v = 123;
    System.out.println(v);

    lib.sayHi();

    int n = 1;
    int m = 2;
    int l = 0;

    if (n > m) {
      l = n;
    } else {
      l = m;
    }

    if (n > m) l = n;
    if (m > n) l = m;
    
    System.out.println(l);

    int min = n < m ? n : m;
    System.out.println(min);

    int month = 1;
    String text = "";
    switch (month) {
      case 1:
        text = "Autumn";
        break;
      default:
        text = "mistake";
        break;
    }
    System.out.println(text);

    try (FileWriter fw = new FileWriter("file.txt", false)) {
      fw.write("line 1");
      fw.append("\n");
      fw.append("2");
      fw.append("\n");
      fw.write("line 3");
      fw.flush();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    FileReader fr = new FileReader("file.txt");
    int aaa;
    while ((aaa = fr.read()) != -1) {
      char chh = (char) aaa;
      if (chh == '\n') {
        System.out.print(chh);
      } else {
        System.out.print(chh);
      }
    }
    fr.close();

    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    String str;
    while ((str = br.readLine()) != null) {
      System.out.printf("== %s ==\n", str);
    }
    br.close();
  }

  static String getType(Object o) {
    return o.getClass().getSimpleName();
  }
}