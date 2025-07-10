public class sum {
    public static void main(String[] args) {
        int [] arr= {0,1,2,3,4,5};
        int sum =0;
        double avg;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }  avg=(double)sum/ arr.length;
        System.out.println(sum);
        System.out.printf("%.2f",avg);
    }
}
