package OCP;

// Clase de cliente que usa Drawable
public class ShapeDrawer {

    private Drawable shape;

    public ShapeDrawer(Drawable shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
