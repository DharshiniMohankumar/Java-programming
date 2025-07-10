import java.util.Scanner;
class order{
    void display(){
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b = sc.next();
        if (a.charAt(0)>b.charAt(0)){
            System.out.println(b+","+a);
        } else if (b.charAt(0)>a.charAt(0)) {
            System.out.println(a+","+b);
        }}}
public class alphabetical {
    public static void main(String[] args) {
        order obj = new order();
        obj.display();
    }
}
