public class TesteFuncao03 {
    public static void main(String[] args) {
        System.out.println("Vai começar a largada!!!");
        System.out.println(contador(1, 5));
    }
    public static String contador(int i, int f){
        String s = " ";
        for(int c=i; c<=f; c++){
            s += c + " ";
        }
        return s;
    }
}
