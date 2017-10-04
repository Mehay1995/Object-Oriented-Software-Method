import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Game
implements World {
    Shape current = new Shape(100, 0);
    Ground ground = new Ground();
    boolean theEnd = false;
    String GO = "Game Over";
    
    

    public boolean hasEnded() {
        return this.theEnd;
    }

    public void sayBye() { }


    public void teh() {
        this.current.fall();
        if (this.current.y >= 400 || this.current.touches(this.ground)) {
            this.ground.add(this.current);
            this.current = new Shape(200, 0);
            if (this.current.touches(this.ground)) {
                this.theEnd = true;
                this.current = null;
            }
        }
    }


    public void meh(MouseEvent mouseEvent) { }

    public void keh(KeyEvent keyEvent) {
        if (this.current != null) {
            int n = keyEvent.getKeyCode();
            if (n == 37) {
                this.current.left();
            }
            else if (n == 40) {
              this.current.down();
            }
           
            else if (n == 39) {
                this.current.right();
            }
        }
    }
    
            

    public void draw(Graphics graphics) {
        if (this.ground != null) {
            this.ground.draw(graphics);
        }
        if (this.current != null) {
            this.current.draw(graphics);
        }
        if (this.hasEnded()) {
            graphics.drawString(GO, 200, 200);
        }
    }

    public static void main(String[] arrstring) {
        BigBang bigBang = new BigBang(new Game());
        bigBang.start(50, 430);
    }
}