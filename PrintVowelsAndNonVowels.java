import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please type something here: ");
    String textInput = scanner.nextLine();
    System.out.println(" ");
    System.out.println("Reading...");
    System.out.println(" ");

    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;

    for (int i = 0; i < textInput.length(); i++) {
            switch (textInput.charAt(i)) {
              case 'a':
                aCount++;
                break;
              case 'e':
                eCount++;
                break;
              case 'i':
                iCount++;
                break;
              case 'o':
                oCount++;
                break;
              case 'u':
                uCount++;
                break;
              default:
                break;
            }
        }

        System.out.println("Total number of vowels:");
        System.out.println(" ");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);

    scanner.close();
  }
}
