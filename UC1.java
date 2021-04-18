import java.util.*;
public class UC1 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		double len;
		System.out.print("Enter x1: ");
		x1=sc.nextInt();
		System.out.print("Enter y1: ");
		y1=sc.nextInt();
		System.out.print("Enter x2: ");
		x2=sc.nextInt();
		System.out.print("Enter y2: ");
		y2=sc.nextInt();
		len=Math.sqrt(((x2-x1)^2)+((y2-y1)^2));
		System.out.println("Length of line: "+len);
	}
}
