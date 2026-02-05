/* Given two arrays (Get first input for one array and then again get for the other array), find if the product of two array are same. If same, print 1 else print 0. First get n which is the number of elements in both the array(both arrays has same number of elements)

Example - arr1 = [4, 1, 3, 9, 3] arr2 = [2, 9, 4, 4, 2]

Output: 0

Explanation: Product of arr1 = 4* 1* 3* 9* 3 = 324 Product of arr2 = 2* 9* 4* 4* 2 = 576 So 324 is not equal to 576 */

import java.util.*;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long product1 = 1, product2 = 1;

        for (int i = 0; i < n; i++) {
            product1 *= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            product2 *= sc.nextInt();
        }

        System.out.println(product1 == product2 ? 1 : 0);
        sc.close();
    }
}
