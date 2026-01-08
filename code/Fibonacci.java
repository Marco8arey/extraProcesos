public class Fibonacci {

    public void mostrarFibonacci(int n) {

        int primero = 0;
        int segundo = 1;
        int siguiente;

        for (int i = 1; i <= n; i++) {
            System.out.print(primero + " ");
            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
