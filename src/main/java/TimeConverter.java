import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        String run="y";
        Scanner sc = new Scanner(System.in);

        while(run == "y")
        {
            System.out.print("Input hours: ");
            int hours = sc.nextInt();
            System.out.print("Input minutes: ");
            int minutes = sc.nextInt();
            System.out.print("Input seconds: ");
            int seconds = sc.nextInt();
            System.out.println("Total seconds: " + (hours*3600 + minutes*60 + seconds));

            System.out.println("Calculations: \n"+hours + " hours x 3600 = " + hours*3600 + " seconds");
            System.out.println(minutes + " minutes x 60 = " + minutes*60 + " seconds");
            System.out.println(seconds + " seconds = " + seconds + " seconds");
            System.out.println("Total seconds: " + (hours*3600 + minutes*60 + seconds));

            System.out.print("\nRun again? (y/n): ");
            run = sc.next();
        }
    }
}