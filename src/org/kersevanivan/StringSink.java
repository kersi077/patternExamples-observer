package org.kersevanivan;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: StringSink</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 07.09.20 10:57
 */
public class StringSink implements Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private String value;

    @Override
    public void callObservers() {
        observerList.stream().forEach(observer -> observer.update(this.value));
        // The code above can be also written like this:
        //for( Observer observer:observerList )
        //    observer.update(value);
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void setString(String value) {
        this.value = value;
        callObservers();
    }
}
