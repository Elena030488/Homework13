public class Book {
    private String bookName;
    private Author author;
    private int bookYear;
    public Book (String bookName, Author author, int bookYear){
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    @Override
    public String toString() {
        return "Название книги: " + this.bookName + ", автор: " + this.author + ", год написания: " + this.bookYear;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getBookName(), getAuthor(), getBookYear());
    }

    public boolean equals(Book other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return java.util.Objects.equals(getBookName(), book.getBookName()) && java.util.Objects.equals(getAuthor().getAuthorFirstName(), book.getAuthor().getAuthorFirstName()) && java.util.Objects.equals(getAuthor().getAuthorLastName(), book.getAuthor().getAuthorLastName()) && getBookYear() == book.getBookYear();
    }
}

