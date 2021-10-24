package by.bsuir.lab1.task13;

import by.bsuir.lab1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public boolean equals(Object obj) {
        if (obj instanceof ProgrammerBook)
            return super.equals(obj) && this.language == ((ProgrammerBook) obj).language
                    && this.level == ((ProgrammerBook) obj).level;
        else
            return false;
    }

    public String toString() {
        return String.format("%s\nLanguage: %s\nLevel: %s", super.toString(), this.language, this.level);
    }

    public int hashCode() {
        return (int)(super.hashCode() + language.hashCode() * level);
    }
}
