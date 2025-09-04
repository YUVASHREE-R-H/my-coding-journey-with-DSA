//8

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
      int n=12345678;
      int count=0;
      while(n>0){
        count++;
        n=n/10;
        
      }
      System.out.print(count);
      
  }
}
