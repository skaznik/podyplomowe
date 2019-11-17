import java.awt.*;

public class TestTablice {

    public static void main(String[] args) {
        int[] numbers;
        Point[] points;
        Integer[] series = new Integer[3];
        series[0] = 10;
        series[1] = 3;
        series[2] = 5;


        System.out.println(series[1]);

        int[] n = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(n[5]);

        char[] letters = {'a','b','c'};
        System.out.println(letters[letters.length-1]); //letters.lenght-1  odwołanie się do ostatniej wartości tablicy

    }
}
