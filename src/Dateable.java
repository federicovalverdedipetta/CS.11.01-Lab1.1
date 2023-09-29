import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
                int age = scanner.nextInt();
                int dateable = ( 7 + ( age / 2 ) );
        System.out.println(age + " year olds can date " + dateable + " year olds and above");
    }
}
