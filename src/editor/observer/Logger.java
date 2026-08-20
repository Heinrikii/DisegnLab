package editor.observer;

public class Logger implements EditorObeserver {


    @Override
    public void update(String text) {
        System.out.println("Logger: Mudança Registrda " + text);
    }
}
