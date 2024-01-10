package objectAdventure.common;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

import objectAdventure.core.DescriptionType;
import objectAdventure.item.Item;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * General static utility methods.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class Utils {

    /**
     * Private constructor to prevent instantiation.
     */
    private Utils() {
        // Prevent instantiation, this is a utility class.
    }

    /**
     * Capitalize the first letter of the string. If null is received, an empty
     * string is returned.
     *
     * @param str The string to capitalize
     * @return The capitalized string
     */
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        } else {
            if (str.length() == 1) {
                return str.toUpperCase();
            } else {
                return str.substring(0, 1).toUpperCase() + str.substring(1);
            }
        }
    }

    /**
     * Get a list of items in a list display format.
     *
     * @param theList The list of items
     * @return The list of items in a string format
     */
    public static String getFormattedItemList(Collection<? extends Item> theList,
                                              DescriptionType descriptionType) {
        return theList
                .stream()
                .map(switch (descriptionType) {
                    case SHORT -> Item::getItemDisplayName;
                    case LONG -> Item::getItemFullDescription;
                })
                .map(Utils::capitalize)
                .map("*  "::concat)
                .collect(Collectors.joining("\n"));
    }

    @SafeVarargs
    public static <T> List<T> concat(List<? extends T>... lists) {
        return Stream.of(lists)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    /**
     * Wrap input text to a specified width.
     *
     * @param text  The text to wrap
     * @param width The width of the wrapped text.
     */
    public static String wrapText(final String text, final int width) {
        throw new UnsupportedOperationException("Not implemented yet.");

        // TODO: Implement this method.(Why this is not in a standard library is beyond me.)
        // A method exists in the Apache Commons libraries, but I don't want to add a dependency just for this.
        // https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/WordUtils.html
        //
        // Word wrapping is a pain to implement, as you have to handle several the edge cases. (No pun intended.)
        // I actually had to write code for this in Z80 assembly, in the late 1990s... fun times!
    }
}
