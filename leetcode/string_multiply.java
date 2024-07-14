import java.util.Scanner;

public class string_multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(stringSum(str1, str2));
    }


    static String stringSum(String str1, String str2){
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        double sum = num1 * num2;
        return String.valueOf(sum);
    }
}
