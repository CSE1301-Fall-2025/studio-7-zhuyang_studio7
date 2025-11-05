public class rectangle {
    private double length;
    private double width;

    public double perimeter() {
        return length*2 + width*2;
    }

    public double area() {
        return length*width;
    }

    public void setLength(double n) {
        this.length = n;
    }

    public void setWidth(double n) {
        this.width = n;
    }

    public boolean isSquare() {
        if (length == width) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isSmaller(double area) {
        if (area < length*width) {
            return false; //original is larger
        } else{
            return true; //original is smaller
        }
    }

}
