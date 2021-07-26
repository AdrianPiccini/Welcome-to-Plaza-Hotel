import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Rent [] vect =  new Rent [10];
		
		System.out.println("Welcom to Plaza Hotel!");
		System.out.println();
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Please enter your data");
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			Integer room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for (int j = 0; j<10; j++) {
			if ( vect [j] != null) {
				System.out.println(j + ": " + vect[j]);
			}
		}

	}

}
