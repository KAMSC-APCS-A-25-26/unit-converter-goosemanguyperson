import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("--- Temperature Menu ---");
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2: Celsius to Fahrenheit");
            System.out.println("3: Exit");
            System.out.print("Enter a choice:  ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: // F to C: (F - 32) * 5/9
                {
                    System.out.print("\nTemperature in Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();

                    System.out.println("\nFahrenheit: " + fahrenheit);
                    if(fahrenheit >= -459.67)
                    {
                        double celsius = (fahrenheit-32) * 5 / 9;
                        System.out.println("Celsius: " + celsius);
                    }
                    else {
                        System.out.println("Invalid input.");
                    }
                    break;
                }
                case 2: { // C to F: C * 9/5 + 32
                    System.out.print("\nTemperature in Celsius: ");
                    double celsius = sc.nextDouble();

                    System.out.println("\nCelsius: " + celsius);
                    if(celsius >= -273.15)
                    {
                        double fahrenheit = celsius * 9 / 5 + 32;
                        System.out.println("Fahrenheit: " + fahrenheit);
                    }
                    else {
                        System.out.println("Invalid input.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Exiting Menu");
                    run = false;
                    break;
                }
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}