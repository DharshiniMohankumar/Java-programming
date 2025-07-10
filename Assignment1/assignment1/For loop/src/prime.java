public class prime {
    public static void main(String[] args) {
         new prime1();
    }
}
class prime1{
    prime1(){
        for (int i=10;i<=99;i++){
            int count =0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                count++;}
            } if (count==0){
                System.out.print(i+"\t");
            }
        }
    }
}
