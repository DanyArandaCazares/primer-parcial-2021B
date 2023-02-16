package bookcollection;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private short stars;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setStars(short stars) {
        this.stars = stars;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getStars() {
        return stars;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}
