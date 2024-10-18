
import java.util.Scanner;

public class ProgramaDeVotacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Diga a seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2024 - nasc;
        System.out.println("Sua idade é " + i + " anos.");
        if (i<16){
            System.out.println("Não Vota");
        }if((i>=16 && i<18) || (i>70)){
            System.out.println("Opcional");
        }else{
            System.out.println("Obrigatorio");
        }
    }
}
