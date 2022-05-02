package de.uni_bremen.pi2;

import java.util.Arrays;
import java.util.Iterator;

public class Array<E> implements Iterable
{
    Array(final int capacity) {
        System.arraycopy();
        Arrays.copyOf();
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}