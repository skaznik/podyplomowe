public class rzutowanie {
    public static void main(String[] args) {
        byte a = 7;
        short b;
        int c;

        c = a;    //niejawna konwersja
        b = (short)c; //rzutowanie

        int x = 5;
        double y = 13.5;

        double z = x / y; //niejawna konwersja
        System.out.println(z);
        int z1 = x/(int)y; //rzutowanie
        System.out.println(z1);
    }
}
