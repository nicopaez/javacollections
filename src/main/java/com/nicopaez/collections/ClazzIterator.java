package com.nicopaez.collections;

import java.util.Iterator;
import java.util.List;

/**
 * Created by nicopaez on 6/20/15.
 */
public class ClazzIterator implements Iterator {
    private final Class<?> targetClazz;
    private final Iterator innerIterator;

    public ClazzIterator(Iterator iterator, Class<?> clazz) {
        this.targetClazz = clazz;
        this.innerIterator = iterator;
    }

    @Override
    public boolean hasNext() {
        while (this.innerIterator.hasNext()) {
            if (innerIterator.next().getClass() == this.targetClazz) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
