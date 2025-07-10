import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        new sum();
    }
}
class sum{
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int sum=0;
    int digit;
    sum(){
        while (input>0){
            digit=input%10;
            sum= sum+digit;
            input = input/10;
        }
        System.out.println(sum);
    }
}
