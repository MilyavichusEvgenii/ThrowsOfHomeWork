package org.example.HW_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        float number = numbersFloat();
        System.out.println(number);
    }

    public static float numbersFloat(){
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        while (true){
            System.out.println("Введите дробное чило, используя запятую, разделяющую дробную и целую часть");
            try {
                if (scanner.hasNextFloat()) {
                    number = scanner.nextFloat();
                    break;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                System.out.println("Вы ввели неверное значение");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }
}
