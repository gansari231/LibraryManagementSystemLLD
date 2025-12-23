package Entities;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private final String patronId;
    private String name;
    private List<Book> borrowingHistory = new ArrayList<>();

    public Patron(String patronId, String name) {
        this.patronId = patronId;
        this.name = name;
    }

    public void addBorrowedBook(Book book) {
        borrowingHistory.add(book);
    }

    public String getPatronId() {
        return patronId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setBorrowingHistory(List<Book> borrowingHistory) {
        this.borrowingHistory = borrowingHistory;
    }
}
