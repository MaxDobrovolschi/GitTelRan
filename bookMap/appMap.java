package Hash_Map.bookMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class appMap {

    public static void main(String[] args) throws IOException {

        Book book = new Book("Administration", "Admin", 120);
        Book book1 = new Book("Java", "Drake", 100);
        Book book2 = new Book("C++", "Jacob", 250);

        Map<Box, List<Book>> catalog = new HashMap<>();
        appMap boxMap = new appMap();
        boxMap.putBooksToCatalog(catalog, book, book1, book2);


        catalog.forEach((k, v ) -> {
            System.out.println("Box letter" + k.getLetter() + " :" + v.toString());
        });

        System.out.println("Input letter: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        List<Book> bookList = catalog.get(new Box(s.charAt(0)));
        System.out.println(bookList);

    }

    private void putBooksToCatalog(Map<Box, List<Book>> catalog, Book...books) {
        for (Book book : books) {
            char alphabetIndex = book.getAlphabetIndex();
            Box box = getBox(alphabetIndex);
            List<Book> bookList;
            if(catalog.containsKey(box)){
                bookList = catalog.get(box);
                bookList.add(book);

            } else {
                bookList = new ArrayList<>();
                bookList.add(book);
                catalog.put(box, bookList);

            }

        }

    }

    private Box getBox(char letter) {
        return new Box(letter);
    }
}
