package org.example.HW_2;

public class Controller {
    private final InputString inputString = new InputString();
    private final CheckOutPutData checkOutPutData = new CheckOutPutData();
    private final Writer writer = new Writer();
    public void controller() throws MyNullStringException, MySizeArrayException{
        String[] strings = new String[0];
        while (strings.length != 6){
            try {
                strings = inputString.inputData("Введите ФИО, год рождения в формате dd-mm-yyyy, номер терефона простым числом и пол буквой 'F' или 'M' через пробел\n");
                checkOutPutData.checkOutPutData(strings);
                writer.setFileWriter(strings);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        
    }
}
