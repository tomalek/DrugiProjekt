import java.util.Scanner;

public class DrugiProjekt {
	public static void main(String[] args) {
		System.out.println("Podaj liczbe: ");
		Scanner skanuj = new Scanner(System.in);
		int i = 0, a = 0, b = 0;
		String s = "a";
		while (!sprawdzInt(s)) {
			if (i > 0) {
				System.out.println("kurwa liczbe debilu a nie cos innego!");
				System.out.println("Podaj jeszcze raz ALE LICZBE: ");
			}
			i++;
			s = skanuj.nextLine();
			sprawdzInt(s);

		}
		i = 0;
		System.out.println("Wpisales takom liczbe: " + s);

	}

	public static boolean sprawdzInt(String s) {
		int ss;
		try {
			ss = Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}

		return true;

	}

}
