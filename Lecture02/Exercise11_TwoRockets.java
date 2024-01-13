// Derek Hong

public class Exercise11_TwoRockets {
    public static void main (String[] args) {
        triangle();
        squares();
        USA();
        squares();
        triangle();
    }
    public static void triangle() {
        System.out.println("   /\\       /\\  ");
        System.out.println("  /  \\     /  \\  ");
        System.out.println(" /    \\   /    \\ ");
        System.out.println("/      \\ /      \\");
    }
    public static void squares() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void USA() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
