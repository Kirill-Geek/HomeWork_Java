package Lesson_6_.Lesson_6;

import java.io.*;
import java.util.*;

public class Lesson {
    
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Создаем коллекции для хранения значений параметров ноутбуков.
        Map<Integer, Integer> valos = new HashMap<>();
        Map<Integer, Integer> storage = new HashMap<>();
        Map<Integer, String> system = new HashMap<>();
        Map<Integer, String> color = new HashMap<>();
        /*
         * Далее создали 6 экземпляров класс и сразу же добавляем 
         * их параметры в коллекции. 
         */
        Notebook n1 = new Notebook();
        valos.put(1,n1.os = 6000);
        storage.put(1,n1.storage = 500);
        system.put(1,n1.system = "Windows");
        color.put(1,n1.color = "Black");
        
        Notebook n2 = new Notebook();
        valos.put(2, n2.os = 4000);
        storage.put(2, n2.storage = 250);
        system.put(2, n2.system = "MacOS");
        color.put(2, n2.color = "White");

        Notebook n3 = new Notebook();
        valos.put(3, n3.os = 8000);
        storage.put(3, n3.storage = 1000);
        system.put(3, n3.system = "Windows");
        color.put(3, n3.color = "Gray");

        Notebook n4 = new Notebook();
        valos.put(4, n4.os = 2000);
        storage.put(4, n4.storage = 250);
        system.put(4, n4.system = "MacOS");
        color.put(4, n4.color = "Black");

        Notebook n5 = new Notebook();
        valos.put(5, n5.os = 4000);
        storage.put(5, n5.storage = 500);
        system.put(5, n5.system = "Windows");
        color.put(5, n5.color = "Gray");

        Notebook n6 = new Notebook();
        valos.put(6,n6.os = 8000);
        storage.put(6, n6.storage = 500);
        system.put(6, n6.system = "Linux");
        color.put(6, n6.color = "White");


        System.out.println("Введите цифру, соответствующую необходимому критерию :");
        System.out.println("1 - ОЗУ \n2 - Объем ЖД \n3 - Операционная система \n4 - Цвет");
        // value - фильтрация по категориям.
        char value = iScanner.next().charAt(0);
        System.out.println("Доступные критерии");
        System.out.println("ОЗ - '2000 - 8000' \nОбъем ЖД - '250 - 1000'\nОперационная система - 'Windows, Linux, MacOS'\nЦвета - 'Black, White, Gray'");
        System.out.println("Выберите минимальное значение для критериев либо другие доступные критерии");
        //fil - более подробная фильтрация. 
        String fil = iScanner.next();
        /*
        * при выборе сортировки по критерию происходит вывод 
        * на экран только тех которые соответствуют выбранному критерию.   
        */
        if (value == '1') {
            int fill = Integer.parseInt(fil);
            for (Map.Entry<Integer, Integer> el : valos.entrySet()) {
                int cou = el.getValue();
                if (cou > fill) {
                    System.out.printf("Number - %d, Val_OS - %d\n", el.getKey(), el.getValue());
                }    
            }
        }
        if (value == '2') {
            int foll = Integer.parseInt(fil);
            for (Map.Entry<Integer, Integer> el : storage.entrySet()) {
                int stor = el.getValue();
                if (stor > foll) {
                    System.out.printf("Number - %d, Storage - %d\n", el.getKey(), el.getValue());
                }
            }
        }
        if (value == '3') {
            for (Map.Entry<Integer, String> el : system.entrySet()) {
                String sys = el.getValue();
                if (sys.equals(fil)) {
                    System.out.printf("Number - %d, System - %s \n", el.getKey(), el.getValue());
                }
            }    
        }
        if (value == '4') {
            for (Map.Entry<Integer, String> el : color.entrySet()) {
                String col = el.getValue();
                if (col.equals(fil)) {
                    System.out.printf("Number - %d, Color - %s  \n", el.getKey(), el.getValue());
                }
            }
        }
        //Производим 'выбор', и выводим на экран все характеристики выбранного ноутбука.
        System.out.println("Введите номер выбранного Вами ноутбука ");
        int note = iScanner.nextInt();
        System.out.println("Вы выбрали ноутбук со следующими характеристиками :");
        System.out.printf("ОЗУ - %d \n", valos.get(note));
        System.out.printf("Объем жесткого диска - %d \n", storage.get(note));
        System.out.printf("Операционная система - %s \n", system.get(note));
        System.out.printf("Цвет - %s ", color.get(note));
    }
}