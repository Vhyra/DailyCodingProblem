package codingProblem;

import java.util.Scanner;

public class LookAndSay {

    public static void main(String[] args) {

        String num = "";
        int it = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una sequenza di numeri: ");
        num = in.nextLine()+"-";
        System.out.println("Quante iterazioni vuoi che vengano fatte? ");
        it = in.nextInt();
        LookAndSay.counter(num, it);


    }

    public static void counter(String sequenza, int cicli){

        int n1 = 0;
        String soluzione = "";
        char tmp = '0';
        int ite = 0;
        while(cicli>0) {
            for (int i = 0; i < sequenza.length(); i++) {
                char carattere = sequenza.charAt(i);
                tmp = carattere;
                for (int j = i; j < sequenza.length(); ) {

                        if (tmp == sequenza.charAt(j)) {
                            if(tmp == '-'){
                                break;
                            }
                            n1++;
                            j++;
                        } else {
                            soluzione = soluzione + "" + n1 + "" + tmp;
                            i += n1 - 1;
                            n1 = 0;
                            break;
                        }


                }
            }
            ite++;
            System.out.println("Iterazione numero: "+ite+" Soluzione: "+soluzione);
            sequenza = soluzione+"-";
            soluzione = "";
            cicli--;
            System.out.println("Cicli rimanenti: "+cicli);
        }



    }

}

