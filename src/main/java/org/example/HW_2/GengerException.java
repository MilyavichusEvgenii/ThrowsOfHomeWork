package org.example.HW_2;

public class GengerException extends Exception{
    GengerException(){
        super("Неверное значение или запись имеет больше одного символа");
    }
}
