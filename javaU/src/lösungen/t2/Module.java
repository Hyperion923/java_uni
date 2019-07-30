package lösungen.t2;

public class Module {
    private String code;
    private String name;
    private  int contactHours = 0;

    public Integer getContactHours() {
        return contactHours;
    }

    public void setContactHours(Integer contactHours) {
        this.contactHours = contactHours;
    }

    public Module(String _code, String _name) {
        code = _code;
        name = _name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}