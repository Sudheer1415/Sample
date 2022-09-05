import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class F {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pid");
		int pid = sc.nextInt();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila" , "root" , "root" );
		 PreparedStatement ps = con.prepareStatement("delete from product2  where pid = ?");
		 ps.setInt(1,pid);
		 int c= ps.executeUpdate();
		 System.out.println(c+ "  record deleted");
		con.close();
		 
	}
	
}
