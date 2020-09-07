package org.kersevanivan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * <p>Title: File</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 07.09.20 13:54
 */
public class File implements Observer {

    private final BufferedWriter writer;

    public File(String filename) throws IOException {
        Objects.requireNonNull(filename);
        this.writer = new BufferedWriter( new FileWriter(filename, true)  );
    }
    @Override
    public void update(String value) {
        try {
            writer.write(value);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            //TODO: Add some logger information here.
            e.printStackTrace();
        }
    }
}
