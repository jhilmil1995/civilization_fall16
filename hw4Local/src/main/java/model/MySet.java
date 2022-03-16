package model;
import java.util.Random;

class MySet<E> implements SimpleSet<E> {
//class MySet<E> {
    private E[] item;
    private int itemcount;
    private static Random rand = new Random();

    public MySet() {
        itemcount = 0;
        item = (E[]) new Object[1];
    }
 /**
     * Adds the passed in element to the set.
     * @param e the element to be added to the set
     */
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] = e;
                itemcount++;
                return true;
            }
        }
        if (item.length == itemcount) {
            increaseSize();
        }
        item[itemcount] = e;
        itemcount++;
        return true;
    }

    private void increaseSize() {
        E[] tempArray =  (E[]) new Object[item.length + 1];
        for (int i = 0; i < item.length; i++) {
            tempArray[i] = item[i];
        }
        item = tempArray;
    }


/*
    /**
     * Removes the passed in element from the set if it is
     * contained in the set, then returns the removed element
     * otherwise throws as ElementDoesNotExistException
     * @param e the element to be removed
     * @return E the element that was removed
     */
    public  E remove(E e) throws ElementDoesNotExistException {
        if (!(this.contains(e))) {
            throw new ElementDoesNotExistException("Element is not in set");
        }
        E[] tempArray =  (E[]) new Object[item.length - 1];
        int j = 0;
        for (E i:item) {
            if (!(e.equals(i)) && e != null) {
                tempArray[j] = i;
                j++;
            }
        }
        item = tempArray;
        itemcount--;
        return e;
    }

    /**
     * Returns true if the passed in element is contained in
     * the set.
     * Returns false if the passed in element is not contained
     * in the set.
     * @param e the element to be checked
     * @return whether the passed in element is contained
     * in the set
     */
    public boolean contains(E e) {
        for (E i:item) {
            if (e.equals(i) && e != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * removes all the passed in elements from the set then returns them
     * throws a ElementDoesNotExistException if one of the passed in elements
     * is not in the set.
     * NOTE: this method should not remove ANY elements from the set
     * if it throws a ElementDoesNotExistException
     * @param e the elements to be removed from the set
     * @return E[] the elements that were removed from the set
     */
    public E[] removeAll(E[] e) throws ElementDoesNotExistException {
        for (E element:e) {
            if (!(this.contains(element))) {
                throw new ElementDoesNotExistException("Not all elements"
                + "present in set");
            }
        }
        for (E element:e) {
            this.remove(element);
        }
        return e;
    }

    /**
     * Removes all elements from the set.
     */
    public void clear() {
        E[] tempArray = (E[]) new Object[1];
        item = tempArray;
        itemcount = 0;
    }

    /**
     * Returns the number of elements contained in the set.
     * @return int the number of elements in the set
     */
    public int size() {
        return itemcount;
    }

    /**
     * Returns false if the set contains 1 or more elements and
     * returns true if the set contains no elements.
     * @return boolean whether the set contains any elements
     */
    public boolean isEmpty() {
        if (itemcount == 0) {
            return true;
        }
        return false;
        /*
        for (E i:item) {
            if (!(i == null)) {
                return false;
            }
        }
        return true;*/
    }

    /**
     * Returns a random element from the set.
     * NOTE: because the set has no ordering returning any element in the
     * set is effectively returning a "random" element
     * throws a ElementDoesNotExistException if there are no elements
     * in the set
     * HINT: you may import java.util.Random to help with this if
     * you want
     * @return E a random element from the set
     */
    public E getRandomElement() throws ElementDoesNotExistException {
        if (isEmpty()) {
            throw new ElementDoesNotExistException("No elements in set");
        }
        int randInt = rand.nextInt(itemcount);
        return item[randInt];

    }

    /**
     * Returns an array of all the elements contained within the SimpleSet.
     * There should be no nulls in the array.
     * @return an array containing all the elements contained
     * within the set
     */
    public E[] toArray() {
        E[] itemArray = (E[]) new Object[itemcount];
        for (int i = 0; i < item.length; i++) {
            if (!(item[i] == null)) {
                itemArray[i] = item[i];
            }
        }
        return itemArray;
    }

    /**
     * Calculates and returns a String representation of this object.
     * Any String that shows each individual element's toString
     * is acceptable.
     * @return String the String representation of this object
     */
    //@Override
    public String toString() {
        if (itemcount == 0) {
            return "{ }";
        }
        String returned = "{";
        for (E i:item) {
            returned = returned + i + ", ";
        }
        returned = returned  + "}";
        return returned;
    }


}
