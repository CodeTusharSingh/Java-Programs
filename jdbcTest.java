import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1", "******", "******");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from record");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
                        rs.getInt(3));
            }
            System.out.println(stmt.getResultSet());
            PreparedStatement pstmt = con.prepareStatement("Select * from record where Name = ? and Age = ?");
            pstmt.setString(1, "TS");
            pstmt.setInt(2, 11);
            ResultSet rs1 = pstmt.executeQuery();
            while (rs1.next()) {
                System.out.println(rs1.getString(1) + " " + rs1.getString(2) + " " +
                        rs1.getInt(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
