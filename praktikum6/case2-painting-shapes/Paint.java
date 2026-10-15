public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        return s.area() / coverage;
    }
}
