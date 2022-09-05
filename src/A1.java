interface In1
{
	public int calc(int amt , int roi);
}


public class A1 {
public static void main(String[] args) {
	int i =9;
	
	In1 i1 = (amt,roi ) -> (amt*roi);
	
	System.out.println(i1.calc(12, 4));
	In1 i2 =( int amt , int roi)->(amt*roi+5);
	System.out.println(i2.calc(5, 6));
	In1 i3 = (int roi , int amt)->{
		return roi*3+amt*2;
	};
	System.out.println(i3.calc(3, 6));
	
	//i1.m1();
}
}
