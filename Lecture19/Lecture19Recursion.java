// Derek Hong
// CS142
// These questions are also listed in the Canvas Assignment 
// and if there's any disagreement between them then the versions on Canvas 
// will take precendence over the ones here.
// That said, it will (hopefully) it will (hopefully) be
// useful to have them here, too

public class Lecture19Recursion {
    public static void main(String[] args) {
        System.out.println("printNumsRecursively_1(1,5) ====================");
        printNumsRecursively_1(1, 5);

        System.out.println("printNumsRecursively_2(1,5) =========");
        printNumsRecursively_2(1, 5);

        System.out.println("printNumsRecursively_3(1,5) ====================");
        printNumsRecursively_3(1, 5);
    }

    public static void printNumsRecursively_1(int low, int high) {
        if (low <= high) {
            System.out.println(low);
            printNumsRecursively_1(low + 1, high);
        }
    }

    public static void printNumsRecursively_2(int low, int high) {
        if (low <= high) {
            printNumsRecursively_2(low + 1, high);
            System.out.println(low);
        }
    }

    public static void printNumsRecursively_3(int low, int high) {
        System.out.println(low);
        if (low <= high) {
            printNumsRecursively_3(low + 1, high);
        }
        System.out.println(low);
    }
}

//printNumsRecursively_1
/* 
1
2
3
4
5
*/

//printNumsRecursively_2
/* 
5
4
3
2
1
*/

//printNumsRecursively_3
/*
1
2
3
4
5
6
6
5
4
3
2
1
*/