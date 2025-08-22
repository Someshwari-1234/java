public class FiboPrime {
    
    // Function to check prime number
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to generate Fibonacci and check for prime
    public static void generateFiboPrime(int limit) {
        int a = 0, b = 1;
        System.out.println("FiboPrime numbers up to " + limit + ":");
        
        for (int i = 1; i <= limit; i++) {
            int fib = a;
            if (isPrime(fib)) {
                System.out.print(fib + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 15; // number of Fibonacci terms
        generateFiboPrime(n);
    }
}
