package services.complex_numbers.readers;

import entities.ComplexNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumericalReader implements I_ReadComplexNumber {


    @Override
    public ComplexNumber readComplexNumber(String usersInput) {

        double realPart = 0;
        double imaginaryPart = 0;

        usersInput = usersInput.replaceAll(" ", "");

        Pattern patternOneImagine = Pattern.compile("[+-]i");
        Matcher matcherOneImagine = patternOneImagine.matcher(usersInput);

        Pattern patternImagine = Pattern.compile("[+-]?\\d+\\.?\\d*i");
        Matcher matcherImagine = patternImagine.matcher(usersInput);

        String match = "";

        if (matcherOneImagine.find()) {
            match = usersInput.substring(matcherOneImagine.start(), matcherOneImagine.end());
            match = match.replaceAll("i", "1");
            usersInput = usersInput.substring(0, matcherOneImagine.start() - 1);

        } else if (matcherImagine.find()) {
            match = matcherImagine.group();
            match = match.substring(0, match.length() - 1);
            usersInput = usersInput.substring(0, matcherImagine.start() - 1);
        }

        imaginaryPart = Double.parseDouble(match);
        realPart = Double.parseDouble(usersInput);

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
