package com.nicopaez.collections;

import java.util.Iterator;

public class CircularIterator implements Iterator {
    public CircularIterator(Iterator iterator, int roundCount) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
