package trim1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Numeros de termos que voce deseja inprimir
        System.out.println("Sequência de Fibonacci com " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
