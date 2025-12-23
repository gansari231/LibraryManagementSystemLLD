package Services;

import Entities.Patron;

import java.util.HashMap;
import java.util.Map;

public class PatronService {

    private Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getPatronId(), patron);
    }

    public Patron getPatron(String patronId) {
        return patrons.get(patronId);
    }
}
