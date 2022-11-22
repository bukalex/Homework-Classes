public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy", 1828);
        Author gogol = new Author("Nikolay", "Gogol", 1809);

        Book warAndPeace = new Book("War and peace", tolstoy, 1863);
        Book deadSouls = new Book("Dead souls", gogol, 1842);

        System.out.println(deadSouls);
        System.out.println(warAndPeace);
    }
}