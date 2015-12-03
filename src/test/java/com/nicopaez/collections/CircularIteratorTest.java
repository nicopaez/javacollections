package com.nicopaez.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class CircularIteratorTest {

    @Test
    public void isCreatedWithRoundCount() {
        List collection = new ArrayList();
        Iterator iterator = new CircularIterator(collection.iterator(), 1);
        assertNotNull(iterator);
    }

}
