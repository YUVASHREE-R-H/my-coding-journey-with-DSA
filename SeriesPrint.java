//create the following series: (a+ 2^0 . b),(a+2^0.b + 2^1.b),......(a+2^0.b+2^1.b+.....2^n-1 .b)

import java.util.*;
import java.io.*;

class SeriesPrint{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j=0;j<n;j++){
                
                int power= (int)(Math.pow(2, j)*b);
                sum+=power;
                System.out.print(sum + " ");
                
            }
            System.out.println();
        }
        in.close();
    }
}
