
public class largest {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int c=20;
		
		while(a>b && b>c) {
			System.out.print("first whle");
			System.out.println(a+" is largest");
			break;
		}
		
		while(b>a && a>c) {
			System.out.print("second whle");
			System.out.print(b+" is largest");
			break;
		}
		
		while(c>a && c>b) {
			System.out.print("third whle");
			System.out.print(c+" is largest");
			break;
		}

	}

}
