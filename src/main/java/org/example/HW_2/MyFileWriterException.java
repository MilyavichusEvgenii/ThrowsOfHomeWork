package org.example.HW_2;

import java.io.IOException;

public class MyFileWriterException extends IOException {
    MyFileWriterException(){
        super("Ошибка записи файла");
    }
}
