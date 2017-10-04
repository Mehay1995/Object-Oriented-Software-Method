import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Shape {
    int x;
    int y;
    int r = (int)(30.0 + Math.random() * 60);
    Color color;

    public Shape(int x, int y) {
      Random rand = new Random();
      float r = rand.nextFloat();
      float g = rand.nextFloat();
      float b = rand.nextFloat();
        this.x = x;
        this.y = y;
        this.color = new Color(r, g, b);
    }

    public void fall() {
        this.y += 4;
    }


    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);
    }

    public void left() // Moves shape to the left
    {
        this.x -= 8;
    }

    public void right() // Moves shapes to the right
    {
        this.x += 8;
    }
    
    public void down() // Moves shapes to Down
    {
      this.y += 8;
    }

    public boolean touches(Ground ground) // check if the shapes touches the ground or another shape if so stops
    {
        for (Shape shape : ground) {
            if (!shape.overlaps(this)) continue;
            return true;
        }
        return false;
    }

    public boolean overlaps(Shape shape) {
        int n = this.x - shape.x;
        int n2 = this.y - shape.y;
        double d = Math.sqrt(n * n + n2 * n2);
        return d <= (double)(this.r + shape.r);
    }
}