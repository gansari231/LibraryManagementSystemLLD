package Services;

import Entities.Book;
import Entities.Patron;

import java.util.logging.Logger;

public class LendingService {

    private static final Logger log =
            Logger.getLogger(LendingService.class.getName());

    public void checkoutBook(Book book, Patron patron) {

        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already borrowed");
        }

        book.setAvailable(false);
        patron.addBorrowedBook(book);

        log.info("Book [" + book.getTitle() + "] checked out by "
                + patron.getName());
    }

    public void returnBook(Book book) {

        book.setAvailable(true);

        log.info("Book [" + book.getTitle() + "] returned");
    }
}
