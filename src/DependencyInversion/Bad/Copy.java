package DependencyInversion.Bad;

import DependencyInversion.Disk;
import DependencyInversion.Keyboard;

public class Copy {
    private final Keyboard keyboard = new Keyboard();
    private final Disk disk = new Disk();

    public void copy () {
        while (keyboard.hasInput()) {
            disk.write(keyboard.getInput());
        }
    }
}
