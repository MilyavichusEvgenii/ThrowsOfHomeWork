package org.example.HW_2;

public class MyNumberInNumbException extends RuntimeException{
    MyNumberInNumbException(){
        super("Номер телефона не может содержать символы, отличные от цифр");
    }
}
