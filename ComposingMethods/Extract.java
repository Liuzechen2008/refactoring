/**
 * The more lines found in a method, the harder it's to figure out what the method does.
 * @author Zechen Liu
 * @date 2022/03/28
 **/
public class Extract {
    public static void main(String[] args) {
        String name = "Zechen Liu";
        printDetails(name, 99.9);
    }

    private static void printDetails(String name, double score) {
        System.out.println("name: " + name);
        System.out.println("score: " + score);
    }
/*
    public static void main(String[] args) {
        String name = "Zechen Liu";
        double score = 99.9;
        System.out.println("name: " + name);
        System.out.println("score: " + score);
    }
*/
}
