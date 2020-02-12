import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public static String NAME_PROMPT;
    public static String LOGIN_PROMPT;
    public static String WRONG_INPUT;

    public View(){
        String sourceName = "text";
        String lang = "ua";
        Locale locale = new Locale(lang);
        ResourceBundle rb = ResourceBundle.getBundle("text",locale);
        NAME_PROMPT = rb.getString("name");
        LOGIN_PROMPT = rb.getString("login");
        WRONG_INPUT = rb.getString("wrong");
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
