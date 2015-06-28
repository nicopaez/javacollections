package com.nicopaez.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nicopaez on 6/20/15.
 */
public class ClassIteratorTest {


    @Test
    public void hasNextShouldReturnTrueWhenClassInstances() {
        List collection = new ArrayList();
        collection.add(new String("Hello!"));
        Iterator it = new ClassIterator(collection.iterator(), String.class);
        Assert.assertTrue(it.hasNext());
    }

    @Test
    public void hasNextShouldReturnFalseWhenNoClassInstances() {
        List collection = new ArrayList();
        collection.add(new String("Hello!"));
        Iterator it = new ClassIterator(collection.iterator(), Integer.class);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void nextShouldReturnAClassInstanceWhenItIsFirst() {
        List collection = new ArrayList();
        collection.add(new String("Hello!"));
        collection.add(new Integer(1));
        collection.add(new Integer(2));
        Iterator it = new ClassIterator(collection.iterator(), String.class);
        it.hasNext();
        Object obj = it.next();
        Assert.assertEquals(String.class, obj.getClass());
    }

    @Test
    public void nextShouldReturnAClassInstanceWhenItIsLast() {
        List collection = new ArrayList();
        collection.add(new Integer(1));
        collection.add(new Integer(2));
        collection.add(new String("Hello!"));
        Iterator it = new ClassIterator(collection.iterator(), String.class);
        it.hasNext();
        Object obj = it.next();
        Assert.assertEquals(String.class, obj.getClass());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeShouldRaiseUnsupportedOperationException() {
        List collection = new ArrayList();
        collection.add(new String("Hello!"));
        Iterator it = new ClassIterator(collection.iterator(), String.class);
        it.hasNext();
        it.remove();
    }

}
