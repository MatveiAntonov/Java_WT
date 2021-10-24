package by.bsuir.lab1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return title == ((Book) obj).title && author == ((Book) obj).author && price == ((Book) obj).price;
        else
            return false;
    }

    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nPrice: %d\nEdition: %d", title, author, price, edition);
    }

    public int hashCode() {
        return (int)(title.hashCode() + author.hashCode() + price * edition);
    }
}


