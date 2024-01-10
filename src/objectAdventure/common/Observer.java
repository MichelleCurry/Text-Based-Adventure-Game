package objectAdventure.common;
// $Date: 2023-04-07 18:52:54 -0400 (Fri, 07 Apr 2023) $

/**
 * Observer pattern interface (Observer)
 *
 * @param <T> The Datatype for the message being passed.
 * @author Adam J. Conover, COSC436/COSC716
 */
@FunctionalInterface
public interface Observer<T> {

    /**
     * @param object The Object being passed as part of the update.
     */
    void update(T object);
}
