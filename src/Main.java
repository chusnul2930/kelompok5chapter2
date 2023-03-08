public class Main {
    public static void main(String[] args) {
        TambahFibonacci fib = new TambahFibonacci(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(fib.ambil(i));
        }
    }
}
