import java.util.Scanner;
class data{
    void alpha(){
        System.out.println("Alphabhet");
    }
    void Digit(){
        System.out.println("Digit");
    }
    void special(){
        System.out.println("Special Character");
    }
}
public class datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        int b = a.charAt(0);
        data obj=new data();
        if (b>=65&&b<=90||b>=97&&b<=122){
            obj.alpha();
        } else if (b>=48&&b<=57) {
            obj.Digit();
        }else {
            obj.special();
        }
    }
}
