import java.util.Scanner;
public class Controller {
    private static final String NAME_REGEX = "[A-Z][a-z]{1,20}";
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println(inputStringWithRegEx(sc));
    }

    public String inputStringWithRegEx(Scanner sc) {
        view.printMessage(view.INPUT_PROMPT);
        String str = sc.nextLine();
        while (!str.matches(NAME_REGEX)){
            view.printMessage(view.WRONG_INPUT);
            System.out.println(str);
            str = sc.nextLine();
        }
        System.out.println("good name!");
        return str;
    }
}
