/**
 * TestTree
 * @autor EvgeniiTiurin
 * @version 1.1
 */

package com.extrajava.test_tree;

import java.util.*;

public class BookCompare implements Comparator<Book> {
    public int compare(Book one, Book two) {
        return (one.title.compareTo(two.title));
    }
}
