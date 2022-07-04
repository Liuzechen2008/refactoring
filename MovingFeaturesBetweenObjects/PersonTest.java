/**
 * @author Zechen Liu
 * @date 2022/07/04
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("test");
        p.setOfficeNumber("7891234");
        p.setOfficeAreaCode("326");
        System.out.println(p.getName());
        System.out.println(p.getOfficeNumber());
        System.out.println(p.getTelephoneNumber());
    }
}
