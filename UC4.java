import java.util.*;
public class UC4 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x11,y11,x12,y12,x21,y21,x22,y22;
		double len1,len2;
		System.out.println("*FIRST LINE*");
		System.out.print("Enter x11: ");
		x11=sc.nextInt();
		System.out.print("Enter y11: ");
		y11=sc.nextInt();
		System.out.print("Enter x12: ");
		x12=sc.nextInt();
		System.out.print("Enter y12: ");
		y12=sc.nextInt();
		len1=Math.sqrt(((x12-x11)*(x12-x11))+((y12-y11)*(y12-y11)));
	    String length1= String.valueOf(len1);
		

		System.out.println("*SECOND LINE*");
		System.out.print("Enter x21: ");
		x21=sc.nextInt();
		System.out.print("Enter y21: ");
		y21=sc.nextInt();
		System.out.print("Enter x22: ");
		x22=sc.nextInt();
		System.out.print("Enter y22: ");
		y22=sc.nextInt();
		len2=Math.sqrt(((x22-x21)*(x22-x21))+((y22-y21)*(y22-y21)));
		String length2= String.valueOf(len2);
		Equals e = new Equals();
		Compares c = new Compares();
		e.Equalsto(length1, length2);
		c.ComparesTo(length1, length2);
	}
}

class Equals{
    void Equalsto(String l1, String l2){
        if(l1.equals(l2)){
    		System.out.println("Lines are equal!");
    	}
    	else{
    			System.out.println("Lines are not equal!");
    	}
    }
}
class Compares{
    void ComparesTo(String l1, String l2){
        if(l1.compareTo(l2)==0){
    		System.out.println("Lines are equal!");
    	}
    	else if(l1.compareTo(l2)>0){
    		System.out.println("1st line is bigger!");
    	}
    	else if(l1.compareTo(l2)<0){
    		System.out.println("2nd line is bigger!");
    	}
    }
}
