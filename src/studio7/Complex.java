public class Complex {
    private double real;
    private double imaginary;

    public void setComplex(double r, double i) {
        real = r;
        imaginary = i;
    }

    public String addComplex(double r, double i) {
        return (real+r) + " + " + (imaginary+i) + "i";
    }

    public String multiplyComplex(double r, double i) {
        return (real*r - imaginary*i) + " + " + (real*i + imaginary*r) + "i";
    }
}
