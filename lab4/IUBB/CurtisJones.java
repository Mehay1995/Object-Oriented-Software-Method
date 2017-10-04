public class CurtisJones extends teamDecorator {
 lineUp line;

 public CurtisJones(lineUp line) {
  this.line = line;
 }

 public String getDescription() {
  return line.getDescription() + " Curtis Jones, ";
 }

 public int skill() {
  return 5 + line.skill();
 }
}