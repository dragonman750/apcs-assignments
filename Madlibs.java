import java.util.Scanner;
public class Madlibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int sum = 0;
		System.out.print("input number beteween 1 and ten");
		int x = console.nextInt();
		
		int y=0;
		while ( y != x ) {
			sum += x ;
			System.out.print("next integer (-1 to quit)? ");
			y=(int) (Math.random()*10)+1;
			
		
		
		}
		System.out.println("sum = " + sum);
		System.out.println(x);
		}
	
	
}

	


