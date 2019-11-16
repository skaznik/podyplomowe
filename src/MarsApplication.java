public class MarsApplication {

    public static void main(String[] args) {
        //utworzenie nowego obiektu (instancji) klasy MarsRobot
    MarsRobot spirit = new MarsRobot();
    spirit.status = "eksploracja";
    spirit.speed = 2;
    spirit.temperature = -60;

    spirit.shwAttributes();

    System.out.println("Zwiększenie prędkości do 3");
        spirit.speed = 3;
        spirit.shwAttributes();
        System.out.println("Zwiększenie prędkości opportunity");
        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.shwAttributes();
        System.out.println("Zmiana temperatury dla opportunity na -45");
        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.shwAttributes();
        spirit.status = "Jestem już w domu";
        spirit.checkStatus();
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = " opportunity badanie";
        opportunity.speed = 1;
        opportunity.temperature = -50;
        opportunity.shwAttributes();

    }


}
