import java.util.Scanner;

public class chat_bot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Hi my name is Pac-man. What's yours");
		String words = console.nextLine();
		System.out.println("Hi " + words + ", Whats your favoret food?");
		String food = console.nextLine();
		if (food == "Pizza") {
			System.out.println("Pizza is realy good, what's your favoret toping");
			String topings = console.nextLine();
			if (topings == "peperoin") {
				System.out.println("Nice, personaly I like a pizza with everything on it ");
			}
		}
	}
}