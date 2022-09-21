import java.util.Scanner;

public class FIRSTBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int age= Integer.parseInt(scanner.nextLine());

        double averageGarde = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, averageGarde);

    }
}
