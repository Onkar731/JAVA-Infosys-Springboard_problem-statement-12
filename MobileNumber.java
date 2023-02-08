public class MobileNumber {
    public static boolean isMobileNumber(long mobNo) {
        if((int)Math.floor(Math.log10(mobNo) + 1) == 10) {
            return true;
        } else {
            return false;
        }
    }
}