import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4,13);
        Point point;
        System.out.println("Położenie początkowe x = "+location.x+" y = "+location.y);// wyświetlanie położenia (bez nazwy klasy)
        System.out.println("Położenie początkowe z nazwą klasy : "+location);

        System.out.println("\nPrzejście do punktu (7,6)");
        location.x = 7;
        location.y = 6;

        point = location; //od tej pory point wskazuje na ten sam obiekt co location
        point.x = 0;
        point.y = 0;
        System.out.println("\nPołożenie końcowe");
        System.out.println("X = "+location.x);
        System.out.println("Y = "+location.y);

        location = null;
        point = null;

        // GC - można już posprzątać - brak referencji dla objektów
    }

}
