package codingProblem;

import java.util.Scanner;

public class FixedPoint {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?");
        int n = in.nextInt();
        int l = 0;
        int[] numeri = new int[n];
        String num = "";
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero ");
            numeri[i] = in.nextInt();
        }

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] == i) {
                num = num + "-" + numeri[i];
                l++;
            }
        }
        if (!num.equals("")) {
            System.out.println("Ci sono " + l + " fixed point e sono: " + num);
        } else {
            System.out.println("Non ci sono fixed point");
        }
    }
}

