import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class G {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pid");
		int pid = sc.nextInt();
		System.out.println("enter pname");
		String pname = sc.next();
		System.out.println("enter price");
		int price = sc.nextInt();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila" , "root" , "root" );
		 PreparedStatement ps = con.prepareStatement("insert into product1 values(?,?,?)");
		 ps.setInt(1,pid);
		 ps.setString(2,pname);
		 ps.setInt(3,price);
		 int c= ps.executeUpdate();
		 System.out.println(c+ "  record updated");
		con.close();
	
	
	}
	
}
