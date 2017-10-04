public class Two {

  public static <T extends CompareGrade<T>> void sort(T[] a) {
    boolean sorted;
    do {
      sorted = true;
      for (int i = 0; i < a.length - 1; i++) {
        if ((a[i]).boobear(a[i+1]) > 0) {
          sorted = false;
          T temp = a[i];
          a[i] = a[i+1];
          a[i+1] = temp;
        }
      }
      System.out.println( Two.toString(a) );
    } while ( ! sorted );
  }

  static <E> String toString(E[] a) {
    String result = "";
    for (E e : a)
      result += e + ", ";
    return result.substring(0, result.length() - 2);
  }

}