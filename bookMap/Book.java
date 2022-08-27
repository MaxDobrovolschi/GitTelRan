package Hash_Map.bookMap;

public class Book {


    private String name;
    private String Author;
    private int pageCount;


    public Book(String name, String author, int pageCount) {
        this.name = name;
        Author = author;
        this.pageCount = pageCount;

    }

    public char getAlphabetIndex() {
        name.toLowerCase().charAt(0);
        return 0;
    }
}

