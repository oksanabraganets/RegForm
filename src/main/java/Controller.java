import java.util.Scanner;
public class Controller {
    private static final String NAME_REGEX = "[A-Z][a-z]{1,20}";
    private static final String LOGIN_REGEX = "[A-Za-z]{1,20}";
    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {

        Scanner sc = new Scanner(System.in);
        model.record.setLastName(inputStringWithRegEx(sc,view.SURNAME_PROMPT,NAME_REGEX));
        model.record.setFirstName(inputStringWithRegEx(sc, view.NAME_PROMPT, NAME_REGEX));
        model.record.setPatronymic(inputStringWithRegEx(sc, view.PATRONYMIC_PROMPT, NAME_REGEX));
        model.record.setLogin(inputStringWithRegEx(sc, view.LOGIN_PROMPT, LOGIN_REGEX));
        model.record.completeRecord();
        printRecord();
    }

    public String inputStringWithRegEx(Scanner sc, String prompt, String regex) {
        view.printMessage(prompt);
        String str = sc.nextLine();
        while (!str.matches(regex)){
            view.printMessage(view.WRONG_INPUT);
            view.printMessage(prompt);
            str = sc.nextLine();
        }
        return str;
    }

    private void  printRecord(){
        view.printMessage(model.record.getFirstName());
        view.printMessage(model.record.getLastName());
        view.printMessage(model.record.getPatronymic());
        view.printMessage(model.record.getShortName());
        view.printMessage(model.record.getLogin());
    }
}
