package com.nicopaez.collections;

import java.util.Iterator;

/**
 * Created by nicopaez on 6/20/15.
 */
public class ClassIterator implements Iterator {
    private final Class<?> targetClazz;
    private final Iterator innerIterator;
    private Object currentObject;

    public ClassIterator(Iterator iterator, Class<?> clazz) {
        this.targetClazz = clazz;
        this.innerIterator = iterator;
    }

    @Override
    public boolean hasNext() {
        while (this.innerIterator.hasNext()) {
            Object pointer = innerIterator.next();
            if ( pointer.getClass() == this.targetClazz) {
                currentObject = pointer;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        return this.currentObject;
    }

    @Override
    public void remove() {
       throw new UnsupportedOperationException();
    }
}
