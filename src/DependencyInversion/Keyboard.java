package DependencyInversion;

import DependencyInversion.Good.IReader;

public class Keyboard implements IReader {
    public boolean hasInput() {
        return true;
    }

    public Character getInput() {
        return 'c';
    }
}
