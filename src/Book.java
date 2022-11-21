public class Book {
    private String name;
    private Author author;
    private int releaseYear;

    public Book(String name, Author author, int releaseYear){
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
}
