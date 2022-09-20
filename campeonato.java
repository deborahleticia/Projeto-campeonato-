import java.util.Scanner;

public class campeonato {
    static void meuMetodo (int pontosC, int pontosF, int saldoC, int saldoF){
        if(pontosC > pontosF){
            System.out.println("C");
        }else if (pontosF > pontosC){
            System.out.println("F");
        }else if (pontosC == pontosF){
            if(saldoC > saldoF){
                System.out.println("C");
            }else if(saldoF > saldoC){
                System.out.println("F");
            }else 
                System.out.println("=");
            }
        }
    public static void main(String[] args){
        Scanner A = new Scanner (System.in);
        int vitC = A.nextInt(); int empC = A.nextInt(); int saldoC = A.nextInt(); int vitF = A.nextInt(); int empF = A.nextInt(); int saldoF = A.nextInt();

        
         int pontosC = (( vitC * 3) + empC);
         int pontosF = (( vitF * 3) + empF);

        meuMetodo(pontosC, pontosF, saldoC, saldoF);
    }   
}
 

