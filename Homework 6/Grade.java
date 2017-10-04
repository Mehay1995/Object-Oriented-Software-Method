public class Grade implements CompareGrade<Grade> {
  String name;
  int score;
  Grade(String name, int score) {
    this.name = name;
    this.score = score;
  }
  public int boobear(Grade other) {
    if (this.score < other.score) return -1;
    else if (this.score > other.score) return 1;
    else return 0;
  }
  public String toString() {
    return name + ":" + score;
  }
}