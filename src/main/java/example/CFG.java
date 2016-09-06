package example;

import java.util.Collections;
import java.util.List;

public class CFG {
  static void fun() {
    fun(Collections.singletonList(null));
    fun(Collections.singletonList(1));
    fun(Collections.singletonList(3));
  }

  private static void fun(List<Object> list) {
    for (Object o : list) {
      if (o == null) {
        continue;
      }
      if (o.equals(1) || o.equals(2)) { // 3 out of 4 branches covered
        break; // but this line not covered, javac 1.8.0_66
      }
      System.out.println("after if");
      break;
    }
  }
}
