public abstract class BookBase {

    protected int id;
    protected String name;
    protected Category category;

    public BookBase(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public abstract String getType();
    public abstract boolean isValid();

    public void display() {
        System.out.println(name + " | " + getType());
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public Category getCategory() { return category; }
}
