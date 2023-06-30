/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibd.transaction.concurrency.locktable.items;

import ibd.transaction.concurrency.Item;

/**
 *
 * @author Sergio
 */
public class DeivisItemCollection implements ItemCollection {

    /*
     * Adds an item related to the PK range defined by the lower and higher values
     */
    public Item addItem(long lower, long higher) {
        return null;
    }

    /*
     * Gets the item that maps the PK range defined by the lower and higher values
     */
    public Item getItem(long lower, long higher) {
        return null;
    }

    /*
     * Gets all items in the form of an iterable list
     */
    public Iterable<Item> getAllItems() {
        return null;
    }

    /*
     * Gets all items whose range overlap with the range defined by the lower and
     * higher values.
     */
    public Iterable<Item> getOverlappedItems(long lower, long higher) {
        return null;
    }

}
