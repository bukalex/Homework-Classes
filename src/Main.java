public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author gogol = new Author("Nikolay", "Gogol");

        Book warAndPeace = new Book("War and peace", tolstoy, 1863);
        Book deadSouls = new Book("Dead souls", gogol, 1842);

        deadSouls.setReleaseYear(1843);
        System.out.println("Год публикации книги " + deadSouls.getName() + ": " + deadSouls.getReleaseYear());
    }
}