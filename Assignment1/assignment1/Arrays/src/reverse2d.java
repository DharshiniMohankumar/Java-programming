public class reverse2d {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter exactly 4 numbers");
            return;
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 4; i++) {
            System.out.print(args[i] + " ");
            if (i % 2 == 1) System.out.println();
        }

        System.out.println("The reverse of the array is:");
        for (int i = 3; i >= 0; i--) {
            System.out.print(args[i] + " ");
            if (i % 2 == 0) System.out.println();
        }
    }
}
