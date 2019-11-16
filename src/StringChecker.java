public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";

        System.out.println("Nasz tekst to : "+str);
        System.out.println("Długość tekstu : "+str.length());
        System.out.println("Znak na pozycji 6 to : "+str.charAt(6)); //numerowane od 0
        System.out.println("Fragment od znaku 10 do 16 : "+str.substring(10,16));
        System.out.println("Wyświetlenie indeksu pierwszej litery t : "+str.indexOf('t'));
        System.out.println("Index początku podtekstu \"długi\" : "+str.indexOf("długi"));
        System.out.println("Tekst zapisany wielkimi literami : "+str.toUpperCase());
    }
}
