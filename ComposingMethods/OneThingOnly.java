import java.util.ArrayList;
import java.util.List;

/**
 * @author Zechen Liu
 * @date 2022/04/01
 **/
public class OneThingOnly {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(2.1);
        list.add(2.0);
        double[] len = getHeightAndWidth(list);
        final double area = len[0] * len[1];
        System.out.println(area);
    }

    private static double[] getHeightAndWidth(List<Double> list) {
        double height = list.get(0);//Use a local variable instead of a parameter.
        double width = list.get(1);
        return new double[]{height, width};
    }

}
