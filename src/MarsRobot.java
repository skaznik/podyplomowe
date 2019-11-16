public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;

    //metoda sprawdzająca temperaturę
    public void checkTemperature() {
        if (temperature < - 80) {
            status = "powrót do domu" ;
            speed = 5;
        }
    }
    // metoda pokazująca atrybuty
    public void shwAttributes() {
        System.out.println("Status:" +status);
        System.out.println("Prędkość:" +speed);
        System.out.println("Temperatura:" +temperature);
    }
    public void checkStatus() {

            System.out.println("Aktualny status robota : " + status);

    }
}
