import java.io.File;
import java.io.FileOutputStream;

public class B {

	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c.txt");
		fos.write(97);
		fos.close();
		System.out.println("Success");
	}
}
