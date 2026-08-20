package editor.observer;

public class StatusBar implements EditorObeserver {

    @Override
    public void update(String text) {
        System.out.println("StatusBar: Texto atualizado -> " + text);
    }
}
