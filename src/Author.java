public class Author {
    private String authorFirstName;
    private String authorLastName;
    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    @Override
    public String toString() {
        return "имя - " + this.authorFirstName + ", фамилия - " + this.authorLastName;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getAuthorFirstName(), getAuthorLastName());
    }

    public boolean equals(Author other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return java.util.Objects.equals(getAuthorFirstName(), author.getAuthorFirstName()) && java.util.Objects.equals(getAuthorLastName(), author.getAuthorLastName());
    }
}

