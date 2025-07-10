public class even {
    public static void main(String[] args) {
        even1 obj = new even1();
    }
}
class even1{
    even1(){
        for (int i=23;i<=57;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
