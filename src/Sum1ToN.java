import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        System.out.println("Wprowadź wartość :");
        System.out.print("\nn = ");
        Scanner scanner = new Scanner(System.in); //pobranie danych od użytkownika z klawiatury
        int n = scanner.nextInt();
        int number = 1;
        int sum = 1;
        System.out.print("Suma 1");
        while (number < n) {
            number++;
            sum += number;
            System.out.print(" + "+ number);
        }
        System.out.println(" = "+sum);
    }
}
