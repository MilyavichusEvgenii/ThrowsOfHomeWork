package org.example.HW_2;

import java.io.IOException;

public class MyNoNumbersInStringName extends IOException {
    MyNoNumbersInStringName(){
        super("В фамилии, имени, отчестве не должно быть цифр");
    }
}
