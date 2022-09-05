import java.io.File;
public class C {
	public static void main(String[] args) throws Exception {
		File f = new File("b.txt");
		if(f.createNewFile())
		System.out.println("created....");
		else 
			System.out.println("Already exists");
	}
}
