import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        //System.out.println("nhap so nguyen");
        // 標準入力から値を取得してinput_lineに入れる
        String value1 = scan.nextLine();
       // System.out.println("nhap so nguyen thu hai");
        String value2 = scan.nextLine();
        
        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
       // int = num1 * num2;
        

        // 取得した値を標準出力するために"XXXXXX"をどう書き換える？
        System.out.println(num1*num2);
       
    }
}
