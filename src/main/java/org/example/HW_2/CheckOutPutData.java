package org.example.HW_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CheckOutPutData {
    Date date;

    public void checkOutPutData(String[] s) throws MyNoNumbersInStringName, MyHappyBirthdayException, MyNumberInNumbException, GengerException {
        String numb = "0123456789";
        boolean bool = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                for (int k = 0; k < numb.length(); k++) {
                    if (s[i].charAt(j) == numb.charAt(k)) {
                        bool = false;
                    }
                }
            }
        }
        if (!bool) {
            throw new MyNoNumbersInStringName();
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy", Locale.ENGLISH);
        try {
            date = formatter.parse(s[3]);
        } catch (ParseException e) {
            throw new MyHappyBirthdayException("Неверный формат даты", 0);
        }
        int calc = 0;
        for (int i = 0; i < s[4].length(); i++) {
            for (int j = 0; j < numb.length(); j++) {
                if (s[4].charAt(i) == numb.charAt(j)) {
                    calc++;
                }
            }
        }
        if (s[4].length() != calc) {
            throw new MyNumberInNumbException();
        }
        if (s[5].equals("M") || s[5].equals("F")) {
            return;
        } else {
            throw new GengerException();
        }
    }
}
