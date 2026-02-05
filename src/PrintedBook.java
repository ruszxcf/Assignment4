public class PrintedBook extends BookBase {

    private int pages;

    public PrintedBook(String name, Category category, int pages) {
        super(name, category);
        this.pages = pages;
    }

    public String getType() {
        return "PRINTED";
    }

    public boolean isValid() {
        return pages > 0;
    }

    public int getPages() {
        return pages;
    }
}
