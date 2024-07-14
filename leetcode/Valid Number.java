import java.util.Scanner;

public class  Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkValid(str));

    }

    static boolean checkValid(String str){
        String regex = "^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$";
        return str.matches(regex);

    }

}
