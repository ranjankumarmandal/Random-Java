import java.util.*;

public class Main {
    public static void checkDuplicateBracket {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any expression: ");
        String str = scn.nextLine();
        System.out.println();
        
        System.out.println("==============================");
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == ')') {
                if(st.peek() == '(') {
                    System.out.println("Duplicate bracket -- Error!!");
                    return;
                } else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        
        System.out.println("No duplicate bracket -- Success!");
    }
}