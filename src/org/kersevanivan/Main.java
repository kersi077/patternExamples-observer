package org.kersevanivan;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        StringSink stringSink = new StringSink();

        Observer consoleObserver = new Console();
        Observer fileObserver = new File("/tmp/testfile.txt"); // Careful! This is NOT the java File Object.

        stringSink.register(consoleObserver);
        stringSink.register(fileObserver);

        stringSink.setString("Hallo");
        stringSink.setString("Welt");
    }
}
