package DependencyInversion.Bad;

import DependencyInversion.Disk;
import DependencyInversion.Keyboard;
import DependencyInversion.Printer;

public class AnotherCopy {
    enum Device {
        DISK, PRINTER
    }
    private final Keyboard keyboard = new Keyboard();
    private final Disk disk = new Disk();
    private final Printer printer = new Printer();

    public void copy (Device device) {
        while (keyboard.hasInput()) {
            if (device == Device.DISK) {
                disk.write(keyboard.getInput());
            } else {
                printer.write(keyboard.getInput());
            }
        }
    }
}
