import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {

        StringTokenizer st1, st2; //tworzymy dwie zmienne typu stringtokenizer

        String quote1 = "GOOG 530,80 -9,98";

        st1 = new StringTokenizer(quote1); //spacji nie trzeba podawać
        System.out.println("Token 1: "+ st1.nextToken());
        System.out.println("Token 2: "+ st1.nextToken());
        System.out.println("Token 3: "+ st1.nextToken());

        String quote2 = "RHT;75,00;0,22";
        st2 = new StringTokenizer(quote2, ";"); //po podaniu wartości podaje się znak rozdzielający
        System.out.println("\nToken 4: "+ st2.nextToken());
        System.out.println("Token 5: "+ st2.nextToken());
        System.out.println("Token 6: "+ st2.nextToken());
    }
}
