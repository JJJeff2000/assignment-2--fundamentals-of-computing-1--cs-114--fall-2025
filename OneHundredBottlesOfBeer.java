public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    for (int i = 100; i > 0; i--) {
      System.out.println(i + " bottles of beer on the wall");
      System.out.println(i + " bottles of beer");
      System.out.print("If one of those bottles");
      System.out.println(" should happen to fall");
      System.out.println(i - 1 + " bottles of beer on the wall");
      System.out.println(" ");
    }
  }
}
