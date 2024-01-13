public class Exercise8_Stewie2 {
    public static void main (String[] args) {
        rightSlash();
        for(int i = 0; i < 5; i++) {
        statement();
        leftSlash();
        }
    }

    public static void rightSlash() {
        System.out.println("//////////////////////");
    }
    public static void leftSlash() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    public static void statement() {
        System.out.println("|| Victory is mine! ||");
    }
}
