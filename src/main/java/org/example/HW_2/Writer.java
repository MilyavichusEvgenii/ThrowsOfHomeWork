package org.example.HW_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    FileWriter fileWriter;
    public void setFileWriter(String[] strings) throws IOException {
        String temp = "";
        for (int i = 0; i < strings.length; i++) {
            temp = temp + " " + strings[i] + " ";
        }
        String name =  String.format("%s.txt", strings[0]);
        File file = new File(name);
        fileWriter = new FileWriter(file, true);
        fileWriter.write(temp + "\n");
        fileWriter.flush();
        fileWriter.close();
    }
}
