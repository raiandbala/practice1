class new1{
	int a;
	int b;
	public void add(int i, int j) {
		a =i;
		b=j;
		int c = a+b;
		System.out.println("addition is :"+c);
	}
		public void multiply(int i, int j) {
			a =i;
			b=j;
			int c = a*b;
			System.out.println("multiplication is :"+c);
		}
}
public class test1{
	public static void main(String[]args) {
		new1 obj = new new1();
		obj.add(4, 7);
		obj.multiply(3, 2);
	}
}