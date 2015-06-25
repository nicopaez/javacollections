package com.nicopaez.collections;

import com.nicopaez.collections.ClazzIterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nicopaez on 6/20/15.
 */
public class ClassIteratorTest  {


    @Test
    public void hasNextShouldReturnTrueWhenClassInstances() {
        List collection = new ArrayList();
        collection.add(new String("Hello!"));
        Iterator it = new ClazzIterator(collection.iterator(), String.class);
        Assert.assertTrue(it.hasNext());

    }

    @Test
    public void hasNextShouldReturnFalseWhenNoClassInstances() {
        List collection = new ArrayList();
        collection.add(new String("Hello!"));
        Iterator it = new ClazzIterator(collection.iterator(), Integer.class);
        Assert.assertFalse(it.hasNext());
    }



}
