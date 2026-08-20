package editor.command;

public class WriteCommand implements Command {

    private Editor editor;
    private String newText;
    public WriteCommand(Editor editor, String newText) {
        this.editor = editor;
        this.newText = newText;
    }


    @Override
    public void execute() {
        editor.setText(newText);
    }

    @Override
    public void undo() {
        editor.undo();
    }
}
