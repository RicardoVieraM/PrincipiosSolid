package OCP;


public class ShapeViolacion {

    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;
    private int shapeType;

    public ShapeViolacion(int shapeType) {
        this.shapeType = shapeType;
    }

    public void draw() {
        if (shapeType == CIRCLE) {
            drawCircle();
        } else if (shapeType == SQUARE) {
            drawSquare();
        }
    }

    private void drawCircle() {
        System.out.println("Drawing a circle");
    }

    private void drawSquare() {
        System.out.println("Drawing a square");
    }
}
