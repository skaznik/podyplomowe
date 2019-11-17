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
    }
}
