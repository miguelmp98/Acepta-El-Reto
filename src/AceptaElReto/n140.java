package AceptaElReto;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * @autor miguelmp98
 * 
 * */
public class n140 {
    static int total = 0;

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String j = sc.nextLine();
        while (!j.contains("-")) {
            int total = 0;
            for (int i = 0; i < j.length(); i++) {
                int f = Integer.parseInt(j.substring(i, i + 1));
                link.offer(f);
                total = total + f;
            }
            while (link.peek() != null) {
                System.out.print(link.poll());
                if (link.peek() != null) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + total);
            j = sc.nextLine();
        }

    }

}
