/**
 * Indirect access to fields is when a field is acted on via access methods (getters and setters).
 * This approach is much more flexible than direct access to fields.
 * @author Zechen Liu
 * @date 2022/07/06
 **/
public class Range {
    private int low, high;
    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }
    private int getLow() {
        return low;
    }
    private int getHigh() {
        return high;
    }
}
