import javax.swing.*;

public class TablesPop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,7};
        int[] counters = new int[10]; //tablica pomocnicza
        for (int i = 0; i<arr.length; i++) {
            int index = arr[i];
            counters[index]++;
        }
        int mostFrequest = 0;
        for (int i = 0; i <10; i++) {
            if (counters[i] > counters[mostFrequest]) {
                mostFrequest = i;
            }
        }
        System.out.println("Najczęściej występującą cyfrą w tablicy jest "+mostFrequest +", wystąpiła "+ counters[mostFrequest]+" razy");
    }

}
