package by.bsuir.lab1.task15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public int compareTo(Book book)
    {
        if (this.isbn > book.isbn)
            return 1;
        else if (this.isbn < book.isbn)
            return -1;
        else
            return 0;
    }
}
