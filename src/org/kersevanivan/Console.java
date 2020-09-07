package org.kersevanivan;

import java.awt.*;

/**
 * <p>Title: Console</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 07.09.20 13:54
 */
public class Console implements Observer {

    @Override
    public void update(String value) {
        System.out.println(value);
    }
}
