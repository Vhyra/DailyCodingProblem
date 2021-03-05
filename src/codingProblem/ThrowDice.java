package codingProblem;

import java.util.Scanner;

public class ThrowDice {

    public ThrowDice(){
    }

    public static void main(String[] args) {

        ThrowDice  dice = new ThrowDice();

        Scanner in = new Scanner(System.in);

        System.out.println("Inserire il numero di dadi: ");
        int n = in.nextInt();

        System.out.println("Inserire il numero di facce: ");
        int f = in.nextInt();

        System.out.println("Inserire il totale desiderato: ");
        int t = in.nextInt();

        System.out.println("Il numero di modi per lanciare i dadi sono: " +
                dice.throwD(n, f, t));

    }

    public double throwD(int a, int b, int c){



        return a;
    }

    public static int[] Arry(int a, int b){
        int[] i = new int[4];
        return i;
    }

}

