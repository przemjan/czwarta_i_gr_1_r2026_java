public class StringDemo {
    public static void main(String[] args) {
        String name = "Ebenezer";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);
        System.out.println("Inicjal: " + inicjal);

        String duze, male;

        name = name.toUpperCase();
        male = name.toLowerCase();
        System.out.println("Imię: " + name);

    }
}
