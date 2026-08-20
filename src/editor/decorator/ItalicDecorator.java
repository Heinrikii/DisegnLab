package editor.decorator;

public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }


    @Override
    public String getText() {
        return "<i>" + textComponent.getText() + "</i>";
    }

}
