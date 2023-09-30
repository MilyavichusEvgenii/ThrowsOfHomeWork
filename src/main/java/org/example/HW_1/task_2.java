package org.example.HW_1;

public class task_2 {
    public static void main(String[] args) {
        try {
            // 2.объявление массива
            Double[] intArray = new Double[0];
            int d = 0;
            //1.не объявлен массив в размере 9 ячеек с типом данных Double,
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            // 3.Добавление исключения, так как массив пустой и в нем нет нужного индекса
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

}
