package org.example.HW_1;

import java.io.FileNotFoundException;

public class task_3 {
    // изменен на throwable
    public static void main(String[] args) throws Throwable {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            // изменен на Exception и поставлен в конец списка и убрана вначале лишняя скобка и добавлена в конец недостающая;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    // изменен на nullpointerexception
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }


}
