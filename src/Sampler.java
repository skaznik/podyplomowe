public class Sampler {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.height = 20;
        sample.width = 37;
        sample.depth = 7;

        System.out.println("Wymiary pudełka : ");
        System.out.println("Wysokość : "+sample.height);
        System.out.println("Szerokość : "+sample.width);
        System.out.println("Głębokość : "+sample.depth);
    }
}
