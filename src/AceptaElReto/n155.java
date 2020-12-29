package AceptaElReto;

import java.util.Scanner;

/*
 * @autor miguelmp98
 * 
 * */
public class n155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = sc.nextInt();
		int base = sc.nextInt();
		while ((altura >= 0) && (base >= 0)) {
			int perimetro = 2 * (base + altura);
			System.out.println(perimetro);
			altura = sc.nextInt();
			base = sc.nextInt();
		}

	}

}
