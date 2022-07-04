/**
 * @author Zechen Liu
 * @date 2022/07/04
 **/
public class Person {
    private String _name;
    //private String _officeAreaCode;
    private String _officeNumber;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public Person(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        //return ("(" + _officeAreaCode + ") " + _officeNumber);
        return ("(" + getOfficeAreaCode() + ") " + _officeNumber);
    }

    public String getOfficeAreaCode() {
        //return _officeAreaCode;
        return _officeTelephone.getAreaCode();
    }


    void setOfficeAreaCode(String arg) {
        //_officeAreaCode = arg;
        _officeTelephone.setAreaCode(arg);
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}
