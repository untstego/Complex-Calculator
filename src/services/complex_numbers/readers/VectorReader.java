package services.complex_numbers.readers;

import entities.ComplexNumber;

import java.util.regex.Pattern;

public class VectorReader implements I_ReadComplexNumber {

    @Override
    public ComplexNumber readComplexNumber(String usersInput) {

        usersInput = usersInput.replaceAll("\\(", "");
        usersInput = usersInput.replaceAll("\\)", "");

        String[] complexNum = usersInput.split(",");

        double realPart = Double.parseDouble(complexNum[0]);
        double imaginePart = Double.parseDouble(complexNum[1]);

        return new ComplexNumber(realPart, imaginePart);
    }
}
