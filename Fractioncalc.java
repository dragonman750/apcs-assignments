import java.util.Scanner;

public class Fractioncalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Hey give me a number or a fraction.");
		String oneNumber = console.nextLine();
		System.out.println("Hey give me another number or a fraction.");
		String twoNumber = console.nextLine();
		System.out.println("hey give me a number 1-4. 1=+, 2=-, 3=* 4=/");
		String simble = console.nextLine();
		System.out.println(oneNumber);
		int v = Integer.parseInt(simble);
		if (v == 1) {
			System.out.println("+");
		} else if (v == 2) {
			System.out.println("-");
		} else if (v == 3) {
			System.out.println("*");
		} else if (v == 4) {
			System.out.println("/");
		} else
			System.out.println("\\('_')/");

		System.out.println(twoNumber);
		System.out.println("=");
		int numerator1;
		int denominator1;
		if (oneNumber.contains("/")) {
			String numbers[] = oneNumber.split("/");
			numerator1 = Integer.parseInt(numbers[0]);
			denominator1 = Integer.parseInt(numbers[1]);

		} else {
			numerator1 = Integer.parseInt(oneNumber);
			denominator1 = 1;
			}
			int numerator2;
			int denominator2;
		if (twoNumber.contains("/")) {
			String numbers[] = twoNumber.split("/");
			numerator2 = Integer.parseInt(numbers[0]);
			denominator2 = Integer.parseInt(numbers[1]);
			
		} else {
			numerator2 = Integer.parseInt(twoNumber);
		denominator2 = 1;
		}
		if (v == 1) {
			int r_numerator =(numerator1 * denominator2) + (numerator2 * denominator1);
			int r_denominator = denominator1 * denominator2;
			fraction_boy(r_numerator, r_denominator);
		} else if (v == 2) {
			int r_numerator =(numerator1 * denominator2) - (numerator2 * denominator1);
			int r_denominator = denominator1 * denominator2;
			fraction_boy(r_numerator, r_denominator);
		} else if (v == 3) {
			int r_numerator = numerator1 * numerator2;
			int r_denominator = denominator1 * denominator2;
			fraction_boy(r_numerator, r_denominator);
		} else if (v == 4) {
			int r_numerator = numerator1 * denominator2;
			int r_denominator = numerator2 * denominator1;
			fraction_boy(r_numerator, r_denominator);
		} else
			System.out.println("sorry man this is'nt going to work.");


		}
	static void fraction_boy(int r_numerator, int r_denominator) {
		if (r_denominator == 1) {
			System.out.println(r_numerator);
		}else {
			System.out.println(""+r_numerator+"/"+r_denominator);
		}
	}
	
//String newStr = str1 + "/" + str2
	}
