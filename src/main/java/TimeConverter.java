import java.util.Objects;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        boolean run=true;
        Scanner sc = new Scanner(System.in);

        while(run)
        {
            System.out.print("Convert time to total seconds\n\nEnter hours: ");
            int hours = sc.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = sc.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = sc.nextInt();

            System.out.println("Time Conversion:\nInput: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
            System.out.println("Total seconds: " + (hours*3600 + minutes*60 + seconds) + " seconds");

            System.out.println("\nCalculation: \n"+hours + " hours x 3600 = " + hours*3600 + " seconds");
            System.out.println(minutes + " minutes x 60 = " + minutes*60 + " seconds");
            System.out.println(seconds + " seconds = " + seconds + " seconds");
            System.out.println("Total seconds: " + (hours*3600 + minutes*60 + seconds));

            System.out.print("\nDo you want to convert another time? (y/n): ");
            if(!Objects.equals(sc.next(), "y"))
                run=false;
        }
    }
}