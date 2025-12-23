package Services;

import Entities.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {

    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        inventory.remove(isbn);
    }

    public void updateBook(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public Book findByIsbn(String isbn) {
        return inventory.get(isbn);
    }

    public List<Book> findByTitle(String title) {
        return inventory.values().stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    public List<Book> findByAuthor(String author) {
        return inventory.values().stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .toList();
    }
}
