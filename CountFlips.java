public class CountFlips {
  public static void main(String[] args) {
// Create a Coin object.
    int headsCount = 0;
    int tailsCount = 0;
// Flip the coin 100 times and count the number of heads and tails.
    Coin myCoin = new Coin();
    for (int i = 1; i <= 100; i++) {
      myCoin.flip();
      if (myCoin.isHeads()) {
        headsCount += 1;
      } else {
        tailsCount += 1;
      }
    }
// Display the results.
  System.out.println("Heads: " + headsCount);
  System.out.println("Tails: " + tailsCount);
  }
}
