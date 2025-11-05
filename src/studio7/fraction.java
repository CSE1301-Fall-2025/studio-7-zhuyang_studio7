public class fraction {
    private int denominator; //below
    private int numerator; //ontop

    public void setFraction(int n, int d) {
        denominator = d;
        numerator = n;
    }

    public String addFraction(int n, int d) {
        return (numerator * d + denominator * n) + "/" + (denominator*d);
    }

    public String multiplyFraction(int n, int d) {
        return (numerator * n) + "/" + (denominator * d);
    }

    public String reciprocal() {
        return denominator + "/" + numerator;
    }

    public String simplify() {
        for (int i = numerator; i >= 2; i--) {
            if (numerator%i == 0 && denominator%i == 0) {
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
        return numerator + "/" + denominator;
    }

}
