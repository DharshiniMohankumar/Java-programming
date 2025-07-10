public class biggest {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        System.out.println("The given array is:");
        int max = Integer.parseInt(args[0]);
        for (int i = 0; i < 9; i++) {
            if (Integer.parseInt(args[i])>max){
                max= Integer.parseInt(args[i]);
            }
            System.out.print(args[i] + " ");
            if ((i+1)%3 == 0) System.out.println();
        }
        System.out.println("the biggest number in the given array is "+max);
    }}
