package editor.command;

import editor.observer.EditorObeserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Editor {

    private String text = "";

    private List<EditorObeserver> obeservers;

    private Stack<String> history;

    public void addObserver(EditorObeserver obs) {
        obeservers.add(obs);
    }

    public void setText(String newText) {
        history.push(newText);
        text = newText;
        notifyObservers();
    }

    public void undo() {
        if (history.isEmpty()) {
            text = history.pop();
            notifyObservers();
        };
    }

    public String getText() {
        return text;
    }

    private void  notifyObservers(){
        for(EditorObeserver obs : obeservers){
            obs.update(text);
        };
    }


}
