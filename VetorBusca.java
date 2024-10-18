
import java.util.Arrays;

public class VetorBusca {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int v:vet){
            System.out.println(v);
        }
        int p =  Arrays.binarySearch(vet, 1);
        System.out.println("Encontre o valor na posiçao " + p);
    }
}
