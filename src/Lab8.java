import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		int o, u;
		String r, a;

		System.out.println("Welcome to our Java class. Which student would you like to"
				+ "learn more about?(enter a number 1-10)");
		Scanner scan = new Scanner(System.in);
		String[][] arr = { { "Brent", "Lives in berkley", "Loves beyond bugers" },
				{ "Eric", "Lives in Boston", "Loves Bagels" }, { "Jason", "Lives in Seatle", "Loves sub sandwhiches" },
				{ "Brad", "Lives in New York", "Loves eggs" }, { "Kelly", "Lives in Paris", "Loves omlettes" },
				{ "Rebecca", "Lives in Ireland", "Loves ice cream" }, { "Becca", "Lives in Detroit", "Loves nachos" },
				{ "Sabastion", "Lives in Oak Park", "Loves chicken" }, { "Marvin", "Lives in Atlantis", "Loves steak" },
				{ "Dylan", "Lives in Royal Oak", "Loves tacos" } };
		o = scan.nextInt() - 1;
		try {
			if ((o < 0) || (o > 10))
				;
			{
				System.out.println(arr[o][0]);
			}
			scan.nextLine();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Number not within range.");
		}

		System.out.println("What would you like to know more about " + arr[o][0] + "? (enter hometown or food)");
		r = scan.nextLine();
		try {
			if ((r.equals("hometown")) || (r.equals("food"))) {
				if (r.equals("hometown")) {
					System.out.println(arr[o][1]);
				}
				if (r.equals("food")) {
					System.out.println(arr[o][2]);
				}
			} else {
				System.out.println("To bad you broke the program!");
			}

		} catch (IllegalArgumentException e) {
			System.out.println("That data does not exist, please try again.(hometown or food)");
		}

		System.out.println("Would you like to know more?(yes/no)");
		a = scan.nextLine();
		if ((a.equals("yes")) || (a.equals("no"))) {
			if (a.equals("yes")) {
				if (r.equals("hometown")) {
					System.out.println(arr[o][2]);
					System.out.println("Goodbye");
				}
				if (r.equals("food")) {
					System.out.println(arr[o][1]);
					System.out.println("Goodbye");
				}
			} else {
				System.out.println("Goodbye");
			}
		}

	}

}
