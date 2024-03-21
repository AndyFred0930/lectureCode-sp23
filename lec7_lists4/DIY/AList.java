package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */
public class AList {
    /** Creates an empty list. */
    public AList() {
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        AList[size()]=x;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return AList[size()-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return AList[i-1];
         
    }

    /** Returns the number of items in the list. */
    public int size() {
        int len=0;
        while( AList[len]!=null)
            {
                len++;
            }
        return len;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int last=AList[size()-1];
        size()--;
        return last;
    }
} 
