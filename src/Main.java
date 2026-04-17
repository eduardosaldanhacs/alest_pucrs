// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int f1(int n) {
        int r = 0;
        int op = 0;
        for (int i = 1; i < n; i++) {
            r = r + 1;
            op = op + 1;
        }
        return op;
    }

    public static int f2(int n) {
        int r = 0;
        int op = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                op = op + 1;
                r = r + 2;
            }
        }
        return op;
    }

    public static int f3(int n) {
        int cont=0;
        for (int i=1; i<n; i++) {
            for (int j = 1; j < n; j++) {
                cont++;
            }
        }
        return cont;
    }
    public static int f4(int n) {
        int r = 0;
        for (int i = 1; i<n; i++)
            for (int j = i; j < 2 * i; j++)
                for (int k = i; k < j; k++)
                    r = r + 1;
        return r;
    }
    public static int f5(int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < i + 3; j++) {
                for (int k = i; k < j; k++) {
                    r = r + 1;
                }
            }
        }
        return r;
    }

    public static int f6(int n) {
        if (n==0) {
            return 1;
        }
        else {
            return f6(n - 1) + f6(n - 1);
        }
    }

    public static void main(String[] args) {
        long op = 0;
        System.out.println("N    |#OP");

        //para cada funcao descomente a linha para chamar a funcao desejada
        for (int n = 1; n <= 10; n++) {
            //op = f1(n);
            op = f2(n);
            //op = f3(n);
            //op = f4(n);
            //op = f5(n);
            //op = f6(n);
            System.out.println(n + "    |" + op);
        }
    }
}