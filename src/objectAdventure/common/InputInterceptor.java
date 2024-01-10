package objectAdventure.common;
// $Date: 2023-04-07 18:52:54 -0400 (Fri, 07 Apr 2023) $

/**
 * Interface for any object that can intercept input.
 * <p>
 * An input interceptor can be used to modify the input before it is processed.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
@FunctionalInterface
public interface InputInterceptor {
    String interceptInput(String inputLine);
}
