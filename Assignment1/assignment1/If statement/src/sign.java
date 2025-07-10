import java.util.Scanner;
class A{
    void checksign(){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num>0){
        System.out.println("postive number");
    } else if(num<0){
        System.out.println("negative number");
    }else{
        System.out.println("zero");
    }
}}
    public class sign {
    public static void main(String[] args) {
        A obj = new A();
        obj.checksign();
    }
}