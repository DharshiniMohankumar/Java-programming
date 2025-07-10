import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        new tri();
    }
}
class tri{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    tri(){
        for (int i=1;i<=n;i++){
            for (int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }for (int j=1;j<=i;j++){
            System.out.print("*"+" ");
        }
            System.out.println();}
    }
}
