public class Author {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Author(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getYearOfBirth(){
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public String toString() {
        return name + " " + surname;
    }

    public boolean equals(Object otherObject) {
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        otherObject = (Author) otherObject;
        return toString().equals(otherObject.toString());
    }

    public int hashCode() {
        return java.util.Objects.hash(yearOfBirth);
    }
}
