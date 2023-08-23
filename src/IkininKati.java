import java.util.Iterator;
import java.util.Scanner;

public class IkininKati {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Bir Sinir Giriniz: ");
		n = scanner.nextInt();
		
		for (int i = 1; i < n; i*= 2) {
			System.out.println(i);
		}

	}

}
