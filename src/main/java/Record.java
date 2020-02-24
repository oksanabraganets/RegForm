public class Record {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String shortName;
    private String login;
    private String phone;
    public String getPhone() {
        return phone;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    private void setShortName() {
        StringBuilder str = new StringBuilder(lastName);
        str.append(' ');
        str.append(firstName.charAt(0));
        str.append('.');
        shortName = str.toString();
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void completeRecord(){
        setShortName();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLogin() {
        return login;
    }

    public void setPhone(String phone) throws MobleOperatorException {
        String str = phone.substring(1,4);
        System.out.println(str);
        if (str.equals("067"))
            this.phone = phone;
        else
            throw new MobleOperatorException("Mobile Operator not found", str);
    }

}
