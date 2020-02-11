public class Controller {
    private View view;

    public Controller(View view){
        this.view = view;
    }
    public void processUser(){
        view.printMessage(view.INPUT_PROMPT);
    }
}
