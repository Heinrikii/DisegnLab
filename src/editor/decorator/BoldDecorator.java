package editor.decorator;

public class BoldDecorator extends TextDecorator {

    public BoldDecorator(TextComponent textComponent) {
        super(textComponent);
    }


    @Override
    public String getText() {
        return "<b>" + textComponent.getText() + "</b>";
    }
}
