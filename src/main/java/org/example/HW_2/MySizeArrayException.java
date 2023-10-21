package org.example.HW_2;

public class MySizeArrayException extends ArrayIndexOutOfBoundsException{
    MySizeArrayException(){
        super("Вы ввели неверное количество данных");
    }
}
