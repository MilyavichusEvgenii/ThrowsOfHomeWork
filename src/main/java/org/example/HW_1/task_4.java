package org.example.HW_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        input();
    }
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Введите строку:");
                String a = scanner.nextLine();
                if (a.isEmpty()) {
                    throw new Exception();
                } else {
                    System.out.println(a);
                    break;
                }
            } catch (Exception e){
                System.out.println("Пустые строки вводить нельзя");
            }
        }

    }
}
