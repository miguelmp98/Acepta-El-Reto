package AceptaElReto;
import java.util.Scanner;
/*
 * @autor miguelmp98
 * 
 * */
public class n532 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt(), b = in.nextInt();
            System.out.println(b - a);
        }
    }
}
