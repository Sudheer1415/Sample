
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class A {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("a.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = " My team is very good";
		byte b[]= s.getBytes();
		bos.write(b);
		bos.close();
		fos.close();
		System.out.println("Done....");		
	}	
}
