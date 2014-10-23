import java.util.Scanner;

public class Studienberatung{
	public static void main (String [] args){
		Scanner scanner= new Scanner();
		System.out.println("Hast du Abitur?");
		String antwort = scanner.nextLine();
		if(antwort.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			antwort = scanner.nextLine();
			if(antwort.equalsIgnoreCase("n")){
				
			}
		}
	}
}