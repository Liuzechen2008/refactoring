/**
 * A method's body is just as clear as its name.
 * Put the method's body into the body of its callers and remove the method.
 * @author Zechen Liu
 * @date 2022/07/02
 **/
public class Inline {
    public static void main(String[] args) {
        System.out.println(getRating(6));
    }

    private static int getRating(int num) {
        return (num > 5) ? 2 : 1;
    }

//    private static int getRating(int num)) {
//        return (moreThanFiveLateDeliveries()) ? 2 : 1;
//    }
//
//    private static boolean moreThanFiveLateDeliveries(int num) {
//        return num > 5;
//    }
}
