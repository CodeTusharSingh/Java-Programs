/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jdbc2 {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jdbc2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "**********", "*******")) {
            Statement stmt = conn.createStatement();
            int choice;
            Scanner sc = new Scanner(System.in);
            int n = 1;
            while(n != 0){
            System.out.println("Press 1 to insert data into database.");
            System.out.println("Press 2 to delete data from database.");
            System.out.println("Press 3 to update department's data.");
            System.out.println("Press 4 to view department's data.");
            System.out.println("Press 0 to exit the menu.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            n = choice;
            int id;
            String name, loc;
            switch (choice) {
                case 1:
                    PreparedStatement pstmt1 = conn.prepareStatement("insert into Dept values(?,?,?)");
                    System.out.print("Enter Department Id: ");
                    id = sc.nextInt();
                    pstmt1.setInt(1, id);
                    System.out.print("Enter Department Name: ");
                    name = sc.next();
                    pstmt1.setString(2, name);
                    System.out.print("Enter Department Location: ");
                    loc = sc.next();
                    pstmt1.setString(3, loc);
                    int no = pstmt1.executeUpdate();
                    if (no > 0) {
                        System.out.println("Data inserted successfully.....");
                    } else {
                        System.out.println("Data insertion unsuccessfully.....");
                    }
                    break;
                case 2:
                    PreparedStatement pstmt2 = conn.prepareStatement("delete Dept where dept_id = ?");
                    System.out.print("Enter Department Id: ");
                    id = sc.nextInt();
                    pstmt2.setInt(1, id);
                    int no1 = pstmt2.executeUpdate();
                    if (no1 > 0) {
                        System.out.println("Data deleted successfully.....");
                    } else {
                        System.out.println("Data deletion unsuccessfully.....");
                    }
                    break;
                case 3:
                    PreparedStatement pstmt3 = conn.prepareStatement("update Dept set dept_id = ?, dname = ?, location = ? where dept_id = ?;");
                    System.out.print("Enter Department Id: ");
                    id = sc.nextInt();
                    pstmt3.setInt(1, id);
                    pstmt3.setInt(4, id);
                    System.out.print("Enter Department Name: ");
                    name = sc.next();
                    pstmt3.setString(2, name);
                    System.out.print("Enter Department Location: ");
                    loc = sc.next();
                    pstmt3.setString(3, loc);
                    int no2 = pstmt3.executeUpdate();
                    if (no2 > 0) {
                        System.out.println("Data updated successfully.....");
                    } else {
                        System.out.println("Data updation unsuccessfully.....");
                    }
                    break;
                case 4:
                    ResultSet rs = stmt.executeQuery("select * from Dept");
                    while(rs.next()){
                        System.out.println("Department ID = " + rs.getInt("dept_id"));
                        System.out.println("Department Name = " + rs.getString("dname"));
                        System.out.println("Department Location = " + rs.getString("location"));
                        System.out.println("----------------------------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Exit Successful..........");
                    break;
                default:
                    System.out.println("Invalid Input!!!!!!!!!!!");
                    break;
            }
            
            }
        }
    }
}
