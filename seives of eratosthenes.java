import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scn.nextInt();
        System.out.println();
        
        System.out.println("==================================");
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        for(int i = 2; i * i <= isPrime.length; i++) {
            if(isPrime[i] == true) {
                for(int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        
        // print elements
    }
}