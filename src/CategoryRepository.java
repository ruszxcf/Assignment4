import java.sql.*;
import java.util.*;

public class CategoryRepository {

    public void create(Category c) {

        String sql = "INSERT INTO categories(name) VALUES (?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getName());
            ps.executeUpdate();

        } catch (Exception e) {
            throw new DatabaseOperationException("Insert category failed", e);
        }
    }

    public List<Category> getAll() {

        List<Category> list = new ArrayList<>();

        String sql = "SELECT * FROM categories";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name")
                ));
            }

        } catch (Exception e) {
            throw new DatabaseOperationException("Select category failed", e);
        }

        return list;
    }
}
