import java.util.Scanner;
public class GreaterThan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int f, g, h;
		f = input.nextInt();
		g = input.nextInt();
		h = input.nextInt();
		input.close();
		if (f > g && f > h ) {
			 System.out.println(f);
	}
		else if (g > f && g > h) {
			 System.out.println(g);
		}
		else if (h > f && h > g) {
			 System.out.println(h);
		}
	}
}
