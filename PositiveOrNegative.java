 import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d;
		d =  input.nextInt();
		input.close();
if (d > 0) {
	System.out.println(d + "is positive");
}
else if (d < 0) {
	System.out.println(d + "is negative");
}			
	}
	}

