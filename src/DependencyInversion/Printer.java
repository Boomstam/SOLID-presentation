package DependencyInversion;

import DependencyInversion.Good.IWriter;

public class Printer implements IWriter {
    public void write(Character c) {
        // do something
    }
}
