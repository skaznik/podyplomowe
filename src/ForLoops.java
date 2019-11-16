import java.math.BigInteger;

public class ForLoops {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.printf("%d",i);
        }
        System.out.println();
        int number = 8; //silnia z 5 to jest 1*2*3*4*5
        BigInteger factorial = BigInteger.ONE;
        for (int i=1; i <=number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); //multiply - mnożenie
        }
        System.out.printf("%d! = %s%n", number, factorial);
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<100);
    }
}
