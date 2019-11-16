import java.util.StringTokenizer;

public class changeDate {
    public static void main(String[] args) {
        StringTokenizer st1;
        String dt = "24/12/1996";

        st1 = new StringTokenizer(dt, "/");

        System.out.println("Data urodzenia : ");
        System.out.println("Dzień : "+st1.nextToken());
        System.out.println("Miesiąc : "+st1.nextToken());
        System.out.println("Rok : "+st1.nextToken());


    }
}
