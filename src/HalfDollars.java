public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int[denver.length];  //rozmiar identyczny jak tablica denver
        int[] total = new int[denver.length];
        int average; //średnia
        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;
        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];

        average = (total[0]+total[1]+total[2])/total.length;
        System.out.print("Produkcja w roku 2012: ");
        System.out.printf("%,d sztuk%n", total[0]);
        System.out.print("Produkcja w roku 2013: ");
        System.out.printf("%,d sztuk%n", total[1]);
        System.out.print("Produkcja w roku 2014: ");
        System.out.printf("%,d sztuk%n", total[2]);
        System.out.println("------------------------------------");
        System.out.print("Srednia produkcja wyniosła: ");
        System.out.printf("%,d sztuk%n", average);
    }
}
