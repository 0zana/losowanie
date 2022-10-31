import java.util.Random;
import java.util.Scanner;

public class losowanie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int liczba = random.nextInt(100);
		System.out.println("wpisz liczbę");
		int wybor = scanner.nextInt();
		int licznik=0;
		if (liczba!=wybor) {
			mniejszaWieksza(liczba, wybor);
			do {
				System.out.println("Your next shoot = ");
				wybor=scanner.nextInt();
				mniejszaWieksza(liczba, wybor);
				licznik++;
			}while(liczba!=wybor);
		}
		System.out.println("You tried only " + licznik);
	}
	public static void mniejszaWieksza(int liczba, int wybor) {
		if(liczba>wybor) {
			System.out.println("Your number is too small!");
		}else if (liczba<wybor){
			System.out.println("Your number is too big!");
		}else {
			System.out.println("Great job! It's " + liczba);
			
		}
		
	}
}
	
