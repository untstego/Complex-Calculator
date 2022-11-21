package services;

import entities.ComplexNumber;

public class ArithmeticCalculator {


    public ComplexNumber addComplexNumbers(ComplexNumber first, ComplexNumber second) {
        double realResult = first.realPart() + second.realPart();
        double imaginaryResult = first.imaginaryPart() + second.imaginaryPart();

        return new ComplexNumber(realResult, imaginaryResult);
    }


    public ComplexNumber subtractComplexNumbers(ComplexNumber first, ComplexNumber second) {
        double realResult = first.realPart() - second.realPart();
        double imaginaryResult = first.imaginaryPart() - second.imaginaryPart();

        return new ComplexNumber(realResult, imaginaryResult);
    }


    public ComplexNumber multiplyComplexNumbers(ComplexNumber first, ComplexNumber second) {
        double realResult = (first.realPart() * second.realPart()) - (first.imaginaryPart() * second.imaginaryPart());
        double imaginaryResult = (first.realPart() * second.imaginaryPart()) + (first.imaginaryPart() * second.realPart());

        return new ComplexNumber(realResult, imaginaryResult);
    }


    public ComplexNumber decideComplexNumbers(ComplexNumber first, ComplexNumber second) {
        double realResult = ((first.realPart() * second.realPart()) + (first.imaginaryPart() * second.imaginaryPart()))
                /
                ((second.realPart() * second.realPart()) + (second.imaginaryPart() * second.imaginaryPart()));

        double imaginaryResult = ((second.realPart() * first.imaginaryPart()) - (first.realPart() * second.imaginaryPart()))
                /
                ((second.realPart() * second.realPart()) + (second.imaginaryPart() * second.imaginaryPart()));

        return new ComplexNumber(realResult, imaginaryResult);
    }

}
