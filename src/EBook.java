public class EBook extends BookBase {

    private double fileSize;

    public EBook(String name, Category category, double fileSize) {
        super(name, category);
        this.fileSize = fileSize;
    }

    public String getType() {
        return "EBOOK";
    }

    public boolean isValid() {
        return fileSize > 0;
    }

    public double getFileSize() {
        return fileSize;
    }
}
