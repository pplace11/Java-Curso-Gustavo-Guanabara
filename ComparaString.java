public class ComparaString {
    public static void main(String[] args) {
        String nome1 = "Pedro";
        String nome2 = "Pedro";
        String nome3 = new String("Pedro");
        String res;
        res = (nome1==nome2)?"Igual":"Diferente";
        res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
    }
}
