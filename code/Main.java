import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("¿Cuántos números de Fibonacci deseas ver?: ");
        n = entrada.nextInt();

        Fibonacci fibo = new Fibonacci();

        System.out.println("Secuencia de Fibonacci:");
        fibo.mostrarFibonacci(n);

        entrada.close();
    }
}