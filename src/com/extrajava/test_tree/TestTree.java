/**
 * TestTree
 * @autor EvgeniiTiurin
 * @version 1.1
 */

package com.extrajava.test_tree;

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново своё тело");
        Book b3 = new Book("В поисках Эмо");
        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

