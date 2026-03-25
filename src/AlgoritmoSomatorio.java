public class AlgoritmoSomatorio {
    public static void main(String[] args) {
        System.out.println("O valor é: " + funcaolt(5));
    }

    public static int funcaolt(int entrada) {
        int valor = entrada;
        for (int i = 0; i < entrada; i++) {
            valor = valor + 2;
        }
        return valor;
    }




}