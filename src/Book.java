public class Book {
    private String name;
    private Author author;
    private int releaseYear;

    public Book(String name, Author author, int releaseYear) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return "Название: " + name + "\n" + "Автор: " + author.toString() + "\n" + "Год публикации: " + releaseYear;
    }

    public boolean equals(Object otherObject) {
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        otherObject = (Book) otherObject;
        return toString().equals(otherObject.toString());
    }

    public int hashCode() {
        return java.util.Objects.hash(releaseYear);
    }
}
