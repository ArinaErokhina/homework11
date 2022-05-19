import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearOfPublication;
    private Author author;

    public Book(Author author, String nameBook, int yearOfPublication) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;

    }

    public String getNameBook() {

        return this.nameBook;
    }

    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public Author getAuthor() {

        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название " + this.getNameBook() + ", год публикации " + this.getYearOfPublication() + ", автор:" + getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(nameBook, yearOfPublication, author);
    }

}






