package entities;

import services.ArithmeticCalculator;
import services.complex_numbers.readers.I_ReadComplexNumber;
import services.complex_numbers.readers.NumericalReader;
import services.complex_numbers.readers.VectorReader;

public class ComplexCalculator {

    private VectorReader vectorReader;
    private NumericalReader numericalReader;
    private I_ReadComplexNumber activeReader;

    //По умолчанию, например, активен нумерик. Вся программа работает по принципу нумерика. Свитчер переключает
    //и активный ридер, и всю программу. Вся логика программы упрощается тем, что проверка будет только в одном месте.

    private ArithmeticCalculator arithmeticCalculator;


    //Основной рабочий метод. Разгружает меин.
    private void workProcess() {

    }

}
