import entities.ComplexNumber;
import services.complex_numbers.readers.NumericalReader;
import services.complex_numbers.readers.VectorReader;

public class Main {
    public static void main(String[] args) {

        //Написать меин. Написать хистори.

        numTest("18-   44i");
        numTest("-18+i");
        numTest("18-i");
        numTest("-18-   12.23i");
        numTest("18.123   +44.123i");

        System.out.println("_________________");

        vecTest("(17, 10)");
        vecTest("(-17,-10)");
        vecTest("(-17,           10)");
        vecTest("(17, -10)");
    }

    public static void numTest(String user) {
        NumericalReader reader = new NumericalReader();

        ComplexNumber one = reader.readComplexNumber(user);
        System.out.println(one.toString());
    }

    public static void vecTest(String user) {
        VectorReader reader1 = new VectorReader();

        ComplexNumber one = reader1.readComplexNumber(user);
        System.out.println(one.toString());
    }
}
