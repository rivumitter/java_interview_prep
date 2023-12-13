package java_8.data;

public class Author {

    private String name;
    private String id;
    private Book book;

    public Author(String name, String id, Book book) {
        this.name = name;
        this.id = id;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", book=" + book +
                '}';
    }
}
