import java.util.List;

public class CategoryService {

    private CategoryRepository repo = new CategoryRepository();

    public void addCategory(Category c) {

        if (c.getName() == null || c.getName().isEmpty())
            throw new InvalidInputException("Category name empty");

        repo.create(c);
    }

    public List<Category> getAll() {
        return repo.getAll();
    }
}
