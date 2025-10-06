import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
// Prompt the user to enter text
    System.out.print("Please type something here: ");
    String textInput = scanner.nextLine();
    System.out.println("Reading...\n");
// Make the vowel counting veriables
    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;
    int nonVowelCount = 0;
// Count the vowels and non-vowels
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
                nonVowelCount++;
                break;
            }
        }
// Print the results
        System.out.println("Total number of non-vowels: \n");
        System.out.println("Non-vowels: " + nonVowelCount + "\n");
        System.out.println("Total number of vowels:\n");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
// Close the scanner
    scanner.close();
  }
}
