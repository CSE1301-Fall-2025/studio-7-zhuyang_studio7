public class Die {
    private int sides;

    public int getSides() {
        return sides;
    }

    public int throwDie() {
        return (int) (Math.random()*(sides) + 1);
    }

    public void setSides(int n) {
        this.sides = n;
    }
}