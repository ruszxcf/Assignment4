import java.util.List;

public class BookService {

    private BookRepository repo = new BookRepository();

    public void addBook(BookBase b) {

        if (!b.isValid())
            throw new InvalidInputException("Book invalid");

        repo.create(b);
    }

    public List<BookBase> getAllBooks() {
        return repo.getAll();
    }
}
