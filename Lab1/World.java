import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

interface World {
    public void draw(Graphics g);

    public void teh();

    public void meh(MouseEvent e);

    public void keh(KeyEvent e);

    public boolean hasEnded();

    public void sayBye();
}