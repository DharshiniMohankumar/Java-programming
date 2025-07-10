import java.util.Scanner;
class B{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    void check(){
        if (num<0){
            num = -num;
        }
        if (num%2==0){
            System.out.println("even number");
        } else if (num%2==1){
            System.out.println("odd number");
        }}}
public class oddeven {
    public static void main(String[] args) {
        B obj = new B();
        obj.check();
    }
}
