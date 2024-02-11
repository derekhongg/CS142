public class midtermPractice2 {
    public static void main(String[] args) {
        String x = "java";
        String y = "tyler";
        String z = "tv";
        String rugby = "hamburger";
        String java = "donnie";

        hamburger(x,y,z);
        hamburger(z,x,y);
        hamburger("rugby", z, java);
        hamburger(y, rugby, "x");
        hamburger(y,y, "java");
    }
    public static void hamburger(String y, String z, String x) {
        System.out.println(z + " and " + x + " like " + y);
    }
    
    public static void mystery(int i, int j) {
        while(i != 0 && j != 0) {
            i = i / j;
            j = (j - 1) / 2;
            System.out.print(i + " " + j + " ");
        }
        System.out.println(i);
    }
}
