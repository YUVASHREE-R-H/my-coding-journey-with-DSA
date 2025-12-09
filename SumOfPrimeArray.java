class Main {

    public static int sieve(int L, int R) {

        int[] sieve = new int[R + 1];

        // Step 1: mark all as prime
        for (int i = 0; i <= R; i++) sieve[i] = 1;

        sieve[0] = 0;
        sieve[1] = 0;

        // Step 2: Sieve of Eratosthenes
        for (int i = 2; i * i <= R; i++) {
            if (sieve[i] == 1) {
                for (int j = i * i; j <= R; j += i) {
                    sieve[j] = 0;
                }
            }
        }

        // Step 3: sum primes in range [L, R]
        int sum = 0;
        for (int i = L; i <= R; i++) {
            if (sieve[i] == 1) sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int L = 10;
        int R = 30;

        System.out.println(sieve(L, R));
    }
}
