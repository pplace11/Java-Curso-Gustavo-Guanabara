public class OperadoresAritmetricos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        double m = (n1 + n2) / 2;
        System.out.println(m);
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        int numero2 = 5;
        int valor2 = 5 - --numero2;
        System.out.println(numero2);
        int x = 4;
        x += 2;
        System.out.println(x);
        int y = 8;
        y *= 2;
        System.out.println(y);
        double v = 8.9;
        double ar = Math.floor(v);
        double cima = Math.ceil(v);
        double normal = Math.round(v);
        double aleatorio = 5 + Math.random()*(10-5);
        System.out.println(aleatorio);
        System.out.println(ar);
        System.out.println(cima);
        System.out.println(normal);
    }
}
