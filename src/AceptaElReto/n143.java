package AceptaElReto;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
/*
 * @autor miguelmp98
 * 
 * */
public class n143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mustContinue = true;
        while (mustContinue) {
            int tam = sc.nextInt();
            if (tam == -1) {
                mustContinue = false;
            }
            Deque<Integer> tortitas = new ArrayDeque<>();
            List<Integer> cambio = new ArrayList<>();
            while (tam != -1) {

                tortitas.push(tam);
                tam = sc.nextInt();

            }
            int nVolteos = sc.nextInt();

            for (int i = 1; i <= nVolteos; i++) {
                int volteos = sc.nextInt();
                for (int j = 1; j <= volteos; j++) {
                    cambio.add(tortitas.pop());
                }

                for (int j = 0; j < cambio.size(); j++) {
                    tortitas.push(cambio.get(j));
                }
                cambio.clear();
            }
            if (tortitas.size() != 0) {
                System.out.println(tortitas.peek());
            }

        }

    }
}