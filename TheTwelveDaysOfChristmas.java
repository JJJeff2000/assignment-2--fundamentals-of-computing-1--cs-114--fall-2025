public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
// Initialize day and dayString
    int day = 1;
    String dayString = "1st";
// Loop through each of the twelve days
    while (day <= 12) {
      switch (String.valueOf(day)) {
        case "1":
          day++;
          break;
        case "2":
          dayString = "2nd";
          day++;
          break;
        case "3":
          dayString = "3rd";
          day++;
          break;
        case "4":
          dayString = "4th";
          day++;
          break;
        case "5":
          dayString = "5th";
          day++;
          break;
        case "6":
          dayString = "6th";
          day++;
          break;
        case "7":
          dayString = "7th";
          day++;
          break;
        case "8":
          dayString = "8th";
          day++;
          break;
        case "9":
          dayString = "9th";
          day++;
          break;
        case "10":
          dayString = "10th";
          day++;
          break;
        case "11":
          dayString = "11th";
          day++;
          break;
        case "12":
          dayString = "12th";
          day++;
          break;
      }
// Print the verses for the current day
      System.out.print("On the " + dayString + " day of ");
      System.out.println("Christmas, my true love gave to me");
      if (day >= 13){
        System.out.println("Twelve drummers drumming,");
      }
      if (day >= 12){
        System.out.println("Eleven pipers piping,");
      }
      if (day >= 11){
        System.out.println("Ten lords a-leaping,");
      }
      if (day >= 10){
        System.out.println("Nine ladies dancing,");
      }
      if (day >= 9){
        System.out.println("Eight maids a-milking,");
      }
      if (day >= 8){
        System.out.println("Seven swans a-swimming,");
      }
      if (day >= 7){
        System.out.println("Six geese a-laying,");
      }
      if (day >= 6){
        System.out.println("Five golden rings,");
      }
      if (day >= 5){
        System.out.println("Four calling birds,");
      }
      if (day >= 4){
        System.out.println("Three French hens,");
      }
      if (day >= 3){
        System.out.println("Two turtle doves, and");
      }
      if (day >= 2){
        System.out.println("A partridge in a pear tree.");
        System.out.println(" ");
      }
    }
  }
}
