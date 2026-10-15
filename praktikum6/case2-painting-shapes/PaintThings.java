public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350);

        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        System.out.println("Deck: " + paint.amount(deck));
        System.out.println("BigBall: " + paint.amount(bigBall));
        System.out.println("Tank: " + paint.amount(tank));
    }
}
