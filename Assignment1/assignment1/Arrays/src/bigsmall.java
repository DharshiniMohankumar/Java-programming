public class bigsmall {
    public static void main(String[] args) {
        int[] arr= {67,45,12,9,0,-22,43,88,12};
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smax=0;
        int ssmall=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                smax = max;
                max = arr[i];
            } if (arr[i]<min){
                ssmall = min;
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(min);
        System.out.println(ssmall);
    }
}
