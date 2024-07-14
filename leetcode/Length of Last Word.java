import java.util.Scanner;

public class  Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.trim();
        int count=0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == ' '){
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
