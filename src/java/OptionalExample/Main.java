package OptionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    private List<Book> books;

    public Main() {
        init();

        Optional<Book> book = books.stream().filter(e -> e.getName().equals("test23")).findFirst();

        if (book.isPresent()) {
            System.out.println(book.get());
        } else {
            System.out.println("Book does not exist");
        }

        Book book1 = book.orElseThrow(() -> new RuntimeException("Book does not exist"));

        System.out.println(book1);
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("test", 2));
        books.add(new Book("test2", 3));

    }

    public static void main(String[] args) {
        new Main();

    }
}
