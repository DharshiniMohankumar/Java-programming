import java.util.Scanner;
class Find {
    char ch;
    Find(char ch) {
        this.ch = ch;
    }
    void lowerToUpper() {
        if (ch >= 'a' && ch <= 'z') {
            char converted = (char)(ch - 32);
            System.out.println(converted);
        }
    }
    void upperToLower() {
        if (ch >= 'A' && ch <= 'Z') {
            char converted = (char)(ch + 32);
            System.out.println(converted);
        }
    }
}
public class lowerupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        Find obj = new Find(input);
        obj.lowerToUpper();
        obj.upperToLower();
    }
}
