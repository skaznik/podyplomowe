public class rzutowanieObject {
    public static void main(String[] args) {
        Employee employee = new Employee();
        VicePresident vp = new VicePresident();

        employee = vp; //można
        vp = (VicePresident) employee; //trzeba stosować rzutowanie
    }
}

class Employee {}
class VicePresident extends Employee {} //dziedziczy i rozszerza Employee