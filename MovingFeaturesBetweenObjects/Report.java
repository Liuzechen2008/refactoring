import java.util.Date;

/**
 * Introduce Foreign Method
 * You realize that the code will look and work much better inside a new method in the class.
 * But you can’t add the method to the class because,
 * for example, the class is located in a third-party library.
 *
 * @author Zechen Liu
 * @date 2022/07/04
 **/
public class Report {
    private Date previousEnd;
//    void sendReport() {
//        Date nextDay = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
//    }

    void sendReport() {
        Date newStart = nextDay(previousEnd);
    }

    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}
