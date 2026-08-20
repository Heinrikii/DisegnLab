package editor.decorator;

abstract class TextDecorator implements TextComponent{

    protected TextComponent textComponent;

    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

}
