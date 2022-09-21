import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int allMin = (hour * 60) + min + 30;
        int nextHour = allMin/60;
        int nextMin = allMin % 60;
        if (nextHour > 23){
            nextHour = 0;
        }
        System.out.printf("%d:%02d", nextHour, nextMin);

    }
}
