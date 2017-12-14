import java.util.Scanner;
public class dictence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int schoolx=3;
			int schooly=4; 
			int waverlyx=3; 
			int waverlyy=4;
			int vicx=3;
			int vicy=3;
			dictanc(schoolx, schooly, vicx, vicy);
			dictanc1(schoolx, schooly, vicx, vicy);
			System.out.println("where are you starting");
			String start =stopinput();
			System.out.println("where are you starting");
			String stop1 =stopinput();
			System.out.println("where are you starting");
			String stop2 =stopinput();
			
	}

public static void dictanc(int  x1, int y1, int x2, int y2) {
	
	double xd = Math.abs(x1-x2);
	double yd = Math.abs(y1-y2);
	double p = Math.sqrt((xd*xd)+(yd*yd));
	
	System.out.println(p);
}
public static void dictanc1(int  x3, int y3, int x4, int y4) {
	
	double xd = Math.abs(x3-x4);
	double yd = Math.abs(y3-y4);
	double b = Math.sqrt((xd*xd)+(yd*yd));
	
	System.out.println(b);
}
public static String stopinput() { 
	System.out.println("");
	System.out.println();
	Scanner rand = new Scanner(System.in);
	String stop =rand.next();
	return (stop);
	}

}