package Lesson_6_.Lesson_6;

import java.util.Scanner;
public class Lesson {
    
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Notebook n1 = new Notebook();
        n1.os = 6000;
        n1.storage = 500;
        n1.system = "Windows";
        n1.color = "Black";

        Notebook n2 = new Notebook();
        n2.os = 4000;
        n2.storage = 250;
        n2.system = "Linux";
        n2.color = "White";

        Notebook n3 = new Notebook();
        n3.os = 8000;
        n3.storage = 1000;
        n3.system = "Windows";
        n3.color = "Gray";

        Notebook n4 = new Notebook();
        n4.os = 2000;
        n4.storage = 250;
        n4.system = "MacOS";
        n4.color = "Black";

        Notebook n5 = new Notebook();
        n5.os = 4000;
        n5.storage = 500;
        n5.system = "Windows";
        n5.color = "Gray";

        Notebook n6 = new Notebook();
        n6.os = 8000;
        n6.storage = 500;
        n6.system = "Linux";
        n6.color = "White";

        System.out.println(n1.toString());
        System.out.println("Введите цифру, соответствующую необходимому критерию :");
        System.out.println("1 - ОЗУ \n2 - Объем ЖД \n3 - Операционная система \n4 - Цвет");
        int value = iScanner.nextInt();
        System.out.println(value);
    }
}
