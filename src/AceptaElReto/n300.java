package AceptaElReto;
import java.util.Scanner;

/*
 * @autor miguelmp98
 * 
 * */
public class n300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vocal_a = "a";
		String vocal_e = "e";
		String vocal_i = "i";
		String vocal_o = "o";
		String vocal_u = "u";
		int num = sc.nextInt();
		String palabras;
		for (int i = 0; i < num; i++) {
			palabras = sc.next();
			boolean resA = palabras.contains(vocal_a);
			boolean resE = palabras.contains(vocal_e);
			boolean resI = palabras.contains(vocal_i);
			boolean resO = palabras.contains(vocal_o);
			boolean resU = palabras.contains(vocal_u);
			if (resA && resE && resI && resO && resU) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

}