public class Fibonacci { // class

    public static int fib(int n) { // method fibonacci
            if (n <= 1) {
                return n;
            }
            return fib(n - 1) + fib(n - 2);
        }

    public static void main(String[] args){ // main method
        int n = 10;
        for(int i=0;i<n;i++) {
            System.out.println(fib(i)+" ");
        }
    }

}
