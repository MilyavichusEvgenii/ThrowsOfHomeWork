package org.example.HW_2;

public class MyNullStringException extends NullPointerException{
    MyNullStringException(){
        super("Вы ввели пустую строку");
    }
}
