import editor.command.Command;
import editor.command.Editor;
import editor.command.WriteCommand;
import editor.decorator.BoldDecorator;
import editor.decorator.ItalicDecorator;
import editor.decorator.PlainText;
import editor.decorator.TextComponent;
import editor.observer.Logger;
import editor.observer.StatusBar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addObserver(new StatusBar());
        editor.addObserver(new Logger());

        Command writeHello = new WriteCommand(editor, "Hello World");
        writeHello.execute();

        // Aplicando Decorators
        TextComponent text = new PlainText(editor.getText());
        text = new BoldDecorator(new ItalicDecorator(text));
        System.out.println("Texto decorado: " + text.getText());

        // Undo
        writeHello.undo();
        System.out.println("Texto após undo: " + editor.getText());
    }
}
