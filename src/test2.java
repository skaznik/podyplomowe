public class test2 {
    public static void main(String[] args) {
        String str = "Adam";
        Object obj = new Object();
        System.out.println(str.getClass().getName());
        boolean check = obj instanceof String;
        System.out.println(check);
    }
}
