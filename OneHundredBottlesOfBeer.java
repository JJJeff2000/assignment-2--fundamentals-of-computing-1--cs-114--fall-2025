public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
// Use a for loop to count down from 100 to 0
    for (int i = 100; i > 0; i--) {
// Print the lyrics using the i variable
      System.out.println(i + " bottles of beer on the wall");
      System.out.println(i + " bottles of beer");
      System.out.print("If one of those bottles");
      System.out.println(" should happen to fall");
// Use the i variable to print the correct number of bottles left
      System.out.println(i - 1 + " bottles of beer on the wall");
      System.out.println(" ");
    }
  }
}
