package example;

/**
 * https://bugs.openjdk.java.net/browse/JDK-7024096
 */
public class JDK7024096 {
  static void fun() {
    new JDK7024096()
      .chain()
      .chain();
  }

  public JDK7024096 chain() {
    return this;
  }
}
