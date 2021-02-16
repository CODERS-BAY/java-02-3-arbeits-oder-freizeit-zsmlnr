import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        double time = user.nextDouble();

        boolean freeTime = false;
        if (time < 8.00 || time > 12.00 && time < 13.00 || time > 16.00) {
            freeTime = true;
            System.out.println("Freetime.: " + freeTime);
        } else {
            System.out.println("Freetime.: " + freeTime);
        }


    }
}