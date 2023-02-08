import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        long mobNo = sc.nextLong();

        // checking whether the entered number is mobile number or not
        // using isMobileNumber(int) of MobileNumber class
        if(MobileNumber.isMobileNumber(mobNo)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // closing resource
        sc.close();
    }
}
