package example;

public class Switch {
  static int fun(int c) {
    switch (c) {
      // no coverage for "case ...:"
      case 0:
        return 0;
      case 1:
      case 2:
      default:
        return 1;
    }
  }
}
