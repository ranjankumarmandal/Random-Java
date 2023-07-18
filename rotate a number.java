import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        int num = n, count = 0;
        while(num > 0) {
            num = num / 10;
            count = count + 1;
        }
        
        k = k % count;
        if(k < 0) k = count + k;
        
        int div = (int) Math.pow(10, k), mult = (int) Math.pow(10, count - k);
        int q = n / div, r = n % div;
        
        int result = (r * mult) + q;
        
        System.out.println(result);
    }
}