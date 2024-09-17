public class Main {
    public static void main(String[] args) {

        Van van1 = new Van("V123", "XYZ-1234", "Mercedes", 12);
        System.out.println(van1);


        Microonibus microonibus1 = new Microonibus("M456", "ABC-5678", "Volkswagen", 20);
        System.out.println(microonibus1);


        Onibus onibus1 = new Onibus("O789", "DEF-9101", "Scania", 50, 5000, true);
        System.out.println(onibus1);
    }
}
