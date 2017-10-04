public class MiniDuckSimulator {
 public static void main(String[] args) {
 Duck mallard = new MallardDuck();
 RubberDuck rubberDuckie = new RubberDuck();
 DecoyDuck decoy = new DecoyDuck();
  System.out.println("-------Mallard--------");
  System.out.println("");
 mallard.performQuack();
 mallard.swim();
 mallard.performFly();
 mallard.display(); 
  System.out.println("");
 System.out.println("-------Rubber Duck--------");
 System.out.println("");
 rubberDuckie.performQuack();
 rubberDuckie.swim();
 rubberDuckie.display(); 
 rubberDuckie.performFly();
  System.out.println("");
 System.out.println("--------Decoy--------");
 System.out.println("");
 decoy.performQuack();
 decoy.swim();
 decoy.display(); 
 decoy.performFly();
 
 /*
A Mallard duck is a type of duck. This duck can fly and quack. In the class duck you two instance variables that allow 
you to make classes for different fly behaviors like can't fly and fly. You make an interface with these methods and
make a class that impelments this interface. This allows for multiple different flight classes to easily be inherited to
the duck class which then can be used in all different types of ducks(objects)

The strategy pattern basically creates a framework that allows you to make an object where it can  inherit 
different attributes. 


The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.

A similar problem for the exam could be creating a computer that inherits different computer parts and tells you how
fast your computer will be running. 


  
  
  */
 
 


 
 
 }
}