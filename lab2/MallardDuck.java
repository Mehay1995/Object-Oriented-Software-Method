public class MallardDuck extends Duck {
  public MallardDuck(){
    quackBehavior = new icanQuack(); 
    flyBehavior = new FlyWithWings();
  }
  public void display(){
    System.out.println("I'm a real Mallard Duck!");
  }
}