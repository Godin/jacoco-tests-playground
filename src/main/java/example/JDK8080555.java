package example;

/**
 * https://github.com/jacoco/jacoco/issues/307
 */
public class JDK8080555 {
  static void fun(int p) {
    Object c = new Object();
    while (c != null) {
      switch (p) {
        case 0:
          Object s = null;
          c = null;
          break;
        default:
          c = null;
          break;
      }
    }
  }
}
