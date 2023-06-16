package Lesson2;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Program {
  public static void main(String[] args) {
    String str = "";

    // for (int i = 0; i < 1000000; i++) {
    //   str += "+";
    // }
    // System.out.println(str);
    
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < 1000000; i++) {
      sb.append("+");
    }
    // System.out.println(sb);

    /*  
     * concat() объединение строк
     * valueOf() преобразует Object в строковое представление(завязан на toString())
     * join() объединяет набор строк в одну с учётом разделителя
     * charAt() получение символа по индексу
     * indexOf() первый индекс вхождения подстроки
     * lastIndexOf() последний индекс вхождения подстроки
     * startsWith() / endsWith() определяет, начинается / заканчивается ли строка с подстроки
     * replace() замена одной подстроки на другую
     * trim() удаляет начальные и конечные пробелы
     * substring() возвращает подстроку
     * toLowerCase() / toUpeerCase() возвращает новую строку в нижнем / верхнем регистре
     * compareTo() сравнивает две строки
     * equals() сравнивает строки с учётом регистра
     * equalsIgnoreCase() сравнивает без учёта регистра
     * regionMatches() сравнивает подстроки в строках
     */
  
    File f1 = new File("file.txt");

    try {
      // Код, в котором может быть ошибка
    } catch (Exception e) {
      // Обработка, если ошибка случилась
    }
    finally {
      // Код, который выполняется в любом случае
    }

    /*
     * isHidden() возвращает истину, если каталог или файл является скрытым
     * length() возвращает размер файла в байтах
     * lastModified() возвращает время последнего изменения файла или каталога
     * list() возвращает массив файлов и подкаталогов, которые находятся в каталоге
     * listFiles() возвращает массив файлов и подкаталогов, которые находятся в определённом каталоге 
     * mkdir() создаёт новый каталог
     * renameTo(File dest) переименовывает файл или каталог
     */

    Logger logger = Logger.getLogger(Program.class.getName());
    // INFO, DEBUG, ERROR, WARNING и др.
    // ConsoleHandler info = new ConsoleHandler();
    FileHandler fh;
    try {
      fh = new FileHandler("log.xml");
      logger.addHandler(fh);
      XMLFormatter xml = new XMLFormatter();
      fh.setFormatter(xml);
    } catch (SecurityException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // logger.addHandler(info);
    
    // SimpleFormatter sFormat = new SimpleFormatter();
    // info.setFormatter(sFormat);
    // info.setFormatter(xml);

    // logger.setLevel(Level.INFO);
    logger.log(Level.WARNING, "Тестовое логирование 1");
    logger.info("Тестовое логирование 2");
  }


}
