 public class One {
  public static void main(String[] args) {
    Grade[] students = new Grade[6];
    students[0] = new Grade("Alice" , 40);
    students[1] = new Grade("Bob"   , 80);
    students[2] = new Grade("John"  , 60);
    students[3] = new Grade("Tom"   , 70);
    students[4] = new Grade("Leslie", 80);
    students[5] = new Grade("Alex"  , 50);

    System.out.println( Two.toString(students) );
    Two.sort( students );
    System.out.println( Two.toString(students) );
  }
}