import java.util.List;

public class Main {

    public static void main(String[] args) {

        CategoryService categoryService = new CategoryService();
        BookService bookService = new BookService();

        try {

            Category cat = new Category("Programming");
            categoryService.addCategory(cat);

            Category dbCategory = categoryService.getAll().get(0);

            PrintedBook pBook = new PrintedBook(
                    "Java For Beginners",
                    dbCategory,
                    300
            );

            bookService.addBook(pBook);

            List<BookBase> books = bookService.getAllBooks();

            for (BookBase b : books) {
                b.display();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
