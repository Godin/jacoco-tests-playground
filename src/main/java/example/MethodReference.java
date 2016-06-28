package example;

import java.util.ArrayList;
import java.util.Objects;

public class MethodReference {
  static long fun() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(42);
    return list.stream()
      .filter(Objects::nonNull)
      .filter(Objects::isNull)
      .count();
  }
}
