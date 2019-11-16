import java.util.Date;

/**
 *
 *
 *
 */
public class Test {


    public static void main(String[] args) {
      int accountBalance = 15005;
        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n", accountBalance);
        //flagi
        //s - do formatowania stringów,
        //d - liczby całkowite
        //f - zmienno przecinkowe
        // t - data/czas
        //n - seprator linii
        //bB - wartości logiczne
        //% - znak sterujący

        double pi = Math.PI;

        System.out.println(pi);
        System.out.printf("%.11f%n", pi);

        Date dt = new Date();
        System.out.println(dt);
    }

}
