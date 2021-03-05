package codingProblem;

import java.util.Scanner;

public class LookAndSay {

    public LookAndSay(int n){
        int num = n;
    }

    public static void main(String[] args) {

        String num = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una sequenza di numeri: ");
        num = in.nextLine();
        System.out.println("ecco: "+LookAndSay.counter(num));
        System.out.println("Ciao");


    }

    public static String counter(String n){

        int n1 = 0;
        String soluzione = "";
        char tmp = '0';

        for(int i = 0; i<n.length();i++){
            char carattere = n.charAt(i);
            tmp = carattere;
            for(int j = i; j<n.length();){
                if(tmp==n.charAt(j)){
                    n1++;
                    j++;
                }else{
                    soluzione = soluzione+""+n1 +""+ tmp;
                    i += n1-1;
                    n1 = 0;
                    break;
                }

            }
        }


        return soluzione;
    }

}

