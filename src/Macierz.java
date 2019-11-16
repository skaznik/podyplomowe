import java.util.Scanner;

public class Macierz {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("n = " + n + " matrix");
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("%5s",i + j+ " ");
            }
            System.out.println();
        }
    }
}