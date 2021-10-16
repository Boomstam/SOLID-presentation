package DependencyInversion;

import DependencyInversion.Good.IWriter;

public class Disk implements IWriter {
    public void write(Character c) {
        // do something
    }
}
