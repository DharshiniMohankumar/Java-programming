public class welcome {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("provide an argument");
            return;
        } String name = args[0];
        System.out.println("welcome " + name);
    }
}
