import java.sql.*;
import java.util.*;

public class BookRepository {

    public void create(BookBase book) {

        String sql =
                "INSERT INTO books(name,type,category_id) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps =
                     conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, book.getName());
            ps.setString(2, book.getType());
            ps.setInt(3, book.getCategory().getId());

            ps.executeUpdate();

            ResultSet keys = ps.getGeneratedKeys();
            if (keys.next()) {
                book.setId(keys.getInt(1));
            }

        } catch (Exception e) {
            throw new DatabaseOperationException("Insert book failed", e);
        }
    }

    public List<BookBase> getAll() {

        List<BookBase> list = new ArrayList<>();

        String sql = "SELECT * FROM books";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Category c =
                        new Category(rs.getInt("category_id"), "Unknown");

                String type = rs.getString("type");

                if (type.equals("PRINTED")) {
                    list.add(new PrintedBook(
                            rs.getString("name"),
                            c,
                            100
                    ));
                } else {
                    list.add(new EBook(
                            rs.getString("name"),
                            c,
                            5
                    ));
                }
            }

        } catch (Exception e) {
            throw new DatabaseOperationException("Select books failed", e);
        }

        return list;
    }
}
