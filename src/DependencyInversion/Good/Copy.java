package DependencyInversion.Good;

public class Copy {
    private IReader reader;
    private IWriter writer;

    public Copy(IReader reader, IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copy() {
        while (reader.hasInput()) {
            writer.write(reader.getInput());
        }
    }
}
