public class Record {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String shortName;
    private String login;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    private void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
