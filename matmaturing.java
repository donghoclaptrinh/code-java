import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    if(1 <= len && len <= 100){
 
    String newChar;
        newChar = s.replace("A","4").replace("E","3").replace("G","6").replace("I","1").replace("O","0").replace("S","5").replace("Z","2");

System.out.println(newChar);

        }
    }
}
