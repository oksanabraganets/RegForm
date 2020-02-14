import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public static String NAME_PROMPT;
    public static String SURNAME_PROMPT;
    public static String PATRONYMIC_PROMPT;
    public static String LOGIN_PROMPT;
    public static String WRONG_INPUT;
    public static String PHONE_PROMPT;

    public View(){
        String sourceName = "text";
        String lang = "ua";
        Locale locale = new Locale(lang);
        ResourceBundle rb = ResourceBundle.getBundle("text",locale);
        NAME_PROMPT = rb.getString("name");
        SURNAME_PROMPT = rb.getString("lastname");
        PATRONYMIC_PROMPT = rb.getString("patronymic");
        LOGIN_PROMPT = rb.getString("login");
        WRONG_INPUT = rb.getString("wrong");
        PHONE_PROMPT = rb.getString("phone");
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
