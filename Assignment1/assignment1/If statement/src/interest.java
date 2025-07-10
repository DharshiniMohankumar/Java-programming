import java.util.Scanner;
public class interest {
    private static double interest(String gender, int age) {
        gender = gender.trim().toLowerCase();
        if (gender.equals("female")) {
            if (age >= 1 && age <= 58) {
                return 8.2;
            } else if (age >= 59 && age <= 100) {
                return 9.2;
            }
        } else if (gender.equals("male")) {
            if (age >= 1 && age <= 58) {
                return 8.4;
            } else if (age >= 59 && age <= 100) {
                return 10.5;
            }
        } return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        int age = sc.nextInt();
        double rate = interest(gender,age);
        System.out.println(rate);
    }
}