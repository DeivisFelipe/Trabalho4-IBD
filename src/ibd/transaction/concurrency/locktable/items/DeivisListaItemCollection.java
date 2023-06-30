/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibd.transaction.concurrency.locktable.items;

import java.util.ArrayList;
import ibd.transaction.concurrency.Item;

/**
 *
 * @author Sergio
 */
public class DeivisListaItemCollection implements ItemCollection {
    // Lista de bloqueados
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public Item addItem(long lower, long higher) {
        Item item = getItem(lower, higher);
        if (item == null) {
            item = new Item(lower, higher);
            items.add(item);
        }
        return item;
    }

    @Override
    public Item getItem(long lower, long higher) {
        // Percorre a lista de bloqueados
        for (Item item : items) {
            // Verifica se o item esta na lista
            if (item.getLower() == lower && item.getHigher() == higher) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Iterable<Item> getAllItems() {
        return items;
    }

    @Override
    public Iterable<Item> getOverlappedItems(long lower, long higher) {
        // Lista de itens que estao na lista de bloqueados
        ArrayList<Item> list = new ArrayList<>();
        // Percorre a lista de bloqueados
        for (Item item : items) {
            // Verifica se o item esta na lista
            if (item.getLower() <= higher && item.getHigher() >= lower) {
                list.add(item);
            }
        }
        return list;
    }

}
