import java.awt.Graphics;
import java.util.ArrayList;

public class Ground
extends ArrayList<Shape> {
    public void draw(Graphics graphics) {
        for (Shape shape : this) {
            shape.draw(graphics);
        }
    }
}