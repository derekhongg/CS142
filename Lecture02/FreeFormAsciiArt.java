// Derek Hong
// CS142

public class FreeFormAsciiArt {

    public static void main(String[] args) {
        drawTopHalf();
        drawBottomHalf();
    }

    public static void drawTopHalf() {
        System.out.println("  ________________ ");
        System.out.println(" |   ----------   |");
        System.out.println(" |  |          |  |");
        System.out.println(" |  |          |  |");
        System.out.println(" |  |          |  |");
        System.out.println(" |  |          |  |");
        System.out.println(" |   ----------   |");
        System.out.println(" |                |");
    }

    public static void drawBottomHalf() {
        System.out.println(" |                |");
        System.out.println(" |       Menu     |");
        System.out.println(" |       ___      |");
        System.out.println(" |      |   |     |");
        System.out.println(" |   << |   | >>  |");
        System.out.println(" |      |   |     |");
        System.out.println(" |       ---      |");
        System.out.println(" |       >||      |");
        System.out.println(" |________________|");
    }
}
