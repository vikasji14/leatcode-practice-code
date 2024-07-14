import java.util.*;
public class parentheses{

    static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                st.push(str.charAt(i));
            }else if(str.charAt(i) == ')' && !st.empty() && st.peek() == '('){
                st.pop();
            }else if(str.charAt(i) == ']' && !st.empty() && st.peek() == '['){
                st.pop();
            }else if(str.charAt(i) == '}' && !st.empty() && st.peek() == '{'){
                st.pop();
            }else{
                return false;
            }
        }
        if(st.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {  
            String s = sc.next();
            System.out.println(isValid(s));
        }
    }   
}