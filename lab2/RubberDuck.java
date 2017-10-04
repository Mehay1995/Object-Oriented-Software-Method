public class RubberDuck extends Duck {
 public RubberDuck() {
 flyBehavior = new FlyNoWay();
quackBehavior = new icanQuack();
 }
 public void display() {
 System.out.println("I'm a rubberduck");
 }
}