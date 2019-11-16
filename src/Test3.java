public class Test3 {
    public static void main(String[] args) {
        int x = 5;
        { //start bloku
            int y = 7;
            y = y + x;
        } //koniec bloku
        System.out.println(); // nie można wyświetlić y, bo jest poza blokiem

    }
}
