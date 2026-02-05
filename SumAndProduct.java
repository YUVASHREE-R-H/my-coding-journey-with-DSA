/* Example1: arr =[1,2,3,4] Array has 4 elements so half is going to be 2 elements each, First half sum = 1 + 2 = 3 Second half sum = 3+ 4 = 7 So now to multiply them = 3 * 7 = 21

Example2: arr =[5,3,9,12,3] Array has 4 elements so half is going to be 2 elements each, First half sum = 5 + 3 = 8 Second half sum = 9 + 12 + 3 = 24 So now to multiply them = 8 * 24 = 192 */

import java.io.*;
import java.util.*;

public class SumAndProduct {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i<n/2){
                sum1+=sc.nextInt();
            }
            else{
                sum2+=sc.nextInt();
            }
        }
        
        System.out.println(sum1*sum2);
    }

}
