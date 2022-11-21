package entities;

public record ComplexNumber(double realPart, double imaginaryPart) {

    @Override
    public String toString() {
        return realPart + " " + imaginaryPart + "i";
    }
}
