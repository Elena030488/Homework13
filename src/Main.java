public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("J.R.R.", "Tolkien");
        Author rowling = new Author("J.K.", "Rowling");
        Author rowling2 = new Author("Joanne", "Rowling");
        Book theLordOfTheRings = new Book ("The Lord of the Rings", tolkien, 1954);
        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", rowling, 1997);
        Book harryPotter2 = new Book("Harry Potter and the Sorcerer's Stone", rowling2, 1997);
        theLordOfTheRings.setBookYear(1955);
        System.out.println(theLordOfTheRings);
        System.out.println(harryPotter);
        System.out.println(harryPotter.equals(harryPotter2));
        System.out.println(rowling.equals(rowling2));
        System.out.println(rowling.hashCode());
        System.out.println(rowling2.hashCode());
        System.out.println(harryPotter.hashCode());
        System.out.println(harryPotter2.hashCode());
    }
}

