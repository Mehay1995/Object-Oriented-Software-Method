public class DecoyDuck extends Duck {
 public DecoyDuck() {
 flyBehavior = new FlyNoWay();
quackBehavior = new icanMute();
 }
 public void display() {
 System.out.println("I'm a Decoy Duck");
 }
}