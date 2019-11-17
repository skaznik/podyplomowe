import java.awt.*;

public class TestTablice2 {
    public static void main(String[] args) {
        Point[] markup = {new Point(1,1), new Point(2,3), new Point(5,5)};
        System.out.println(markup[1]);

        String[] titles = new String[5];
        titles[0] = "Pan";
        titles[1] = "Pani";
        titles[2] = "Państwo";
        titles[3] = "Panna";
        titles[4] = "Doktor";
        System.out.println(titles[3]);
 // tablica dwuwymiarowa

        int[][] multiDimArr ={{1,2},{3,4}}; //deklaracja tablicy dwuwymiarowej
        /*
        inny zapis
        int[] a = {1,2};
        int[] b = {3,4};
        int[][] c = {a,b};
         */

        //iterowanie po tablicy
        int[] numbers = {1,5,2,7,3};

        //sposób 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //sposób 2 (skrócony)

        for (int x: numbers) {
            System.out.println(x);
        }

        //iterowanie po tablicy dwuwymiarowej

        System.out.println("-----------------------");
        String[] dogs = {"Burek", "Pluto", "Azor"};
        String[] people = {"Ania", "Wojtek", "Dorota"};
        String[][] names = {dogs, people};

        for (int i = 0; i<names.length; i++ ) {
            for(int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}
