public class Fibonacci {
    /**
     * Mendeklarasikan field untuk parent class Fibonacci
     */
    private int sekarang;
    private int sebelumnya;

    private int selanjutnya;

    private int buffer;

    /**
     * Membuat method Fibonacci untuk memberikan nilai awal pada field dgn
     * menggunakan keyword this
     */
    public Fibonacci() {
        this.sebelumnya = 0;
        this.sekarang = 0;
        this.selanjutnya = 1;
        this.buffer = 0;
    }

    /**
     * Membuat method nilaiSelanjutnya untuk menampung return dan
     * perhitungan dari rumus
     * @return
     */
    public int nilaiSelanjutnya() {
        buffer+=1;
        if(buffer==1){
            return selanjutnya;
        }

        sebelumnya = sekarang;
        sekarang = selanjutnya;
        selanjutnya = sekarang + sebelumnya;
        return selanjutnya;
    }
}

/**
 * Membuat pewarisan dari parent class
 */
class TambahFibonacci extends Fibonacci {
    private int[] cache;

    /**
     * Method untuk penambahan fibonacci
     * @param n sebagai nilai batas
     */
    public TambahFibonacci(int n) {
        cache = new int[n];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = super.nilaiSelanjutnya();
        }
    }

    /**
     * method mengambil nilai
     * @param index
     * @return
     */
    public int ambil(int index) {
        if (index >= cache.length) {
            return -1;
        }
        return cache[index];
    }
}

