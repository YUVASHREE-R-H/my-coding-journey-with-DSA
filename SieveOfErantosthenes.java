class Solution {
    public int[] sieve(int n) {

        int[] sieve = new int[n + 1];

        // Step 1: Mark all as prime (1)
        for (int i = 0; i <= n; i++) {
            sieve[i] = 1;
        }

        sieve[0] = 0;
        sieve[1] = 0;

        // Step 2: Sieve
        for (int i = 2; i * i <= n; i++) {
            if (sieve[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = 0;
                }
            }
        }

        // Step 3: Count primes
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (sieve[i] == 1) count++;
        }

        // Step 4: Fill prime numbers
        int[] primes = new int[count];
        int index = 0;

        for (int i = 2; i <= n; i++) {
            if (sieve[i] == 1) {
                primes[index++] = i;
            }
        }

        return primes;
    }
}
