package objectAdventure.common;
// $Date: 2023-04-07 18:52:54 -0400 (Fri, 07 Apr 2023) $

/**
 * Observer pattern interface (Observable, also known as "Subject")
 *
 * @param <T> The Datatype for the message being passed.
 * @author Adam J. Conover, COSC436/COSC716
 */
public interface Observable<T> {

    /**
     * Add an observer
     *
     * @param theObserver The Observer
     */
    void addObserver(Observer<T> theObserver);

    /**
     * Remove an observer
     *
     * @param theObserver The Observer
     */
    void removeObserver(Observer<T> theObserver);

    /**
     * Notify the observer with an "event" parameter of a polymorphic type.
     *
     * @param notificationObject The object to be used when notifying all observers.
     */
    void notifyObservers(T notificationObject);
}
