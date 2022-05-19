import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }


    public boolean equals(Author other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author stephenKing = (Author) other;
        return nameAuthor.equals(stephenKing.nameAuthor);
    }

    public String toString() {
        return " имя " + this.getNameAuthor() + ", фамилия " + this.getSurnameAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surnameAuthor.equals(author.surnameAuthor);
    }

    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }


}
