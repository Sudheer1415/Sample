import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class E {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila" , "root" , "root" );
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pid");
		int pid = sc.nextInt();
		System.out.println("Enter price");
		int price = sc.nextInt();
	    PreparedStatement ps = con.prepareStatement("Update product2 set price = ? where pid = ?");
		ps.setInt(1, price);
		ps.setInt(2, pid);
		int c= ps.executeUpdate();
		System.out.println(c+ "  record updated");
		con.close();	
	}
	
}
	

