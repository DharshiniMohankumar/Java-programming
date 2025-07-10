import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        new triangle();
    }
}
class triangle{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    triangle(){
        int count=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                count++;
                System.out.print(count+"\t");
            }
            System.out.println();
        }
    }
}