
import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Diga a seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2024 - nasc;
        System.out.println("Sua idade é " + i);
        if (i>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
