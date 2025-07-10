import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        } int find= sc.nextInt();
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==find){
                count++;
                System.out.println(i);
            }
        }if (count==0){
        System.out.println(-1);
    }}
}