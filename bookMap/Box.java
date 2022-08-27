package Hash_Map.bookMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box {


    private char letter;

    private List<Book> books;

    public Box(char letter) {
        this.letter = letter;

    }

    public void putBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return letter == box.letter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter);
    }

    public char getLetter() {
        return letter;
    }
}

