import java.util.ArrayList;
import java.util.List;

public class NoteProject {
    private List<String> notes;

    public NoteProject() {
        notes = new ArrayList<>();
    }

    public void addNote(String note) {
        notes.add(note);
    }

    public void displayNotes() {
        System.out.println("Notes:");
        for (String note : notes) {
            System.out.println("- " + note);
        }
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        NoteProject manager = new NoteProject();
        manager.addNote("FirstColl release  ");
        manager.addNote("Second note");
        manager.displayNotes();
    }
}


