package deque;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/* Performs some basic array deque tests. */
public class ArrayDequeTest {
    public static Deque<Integer> ad = new ArrayDeque<Integer>();

    @Test
    /** Adds a few things to the list, checks that isEmpty() is correct.
     * This is one simple test to remind you how junit tests work. You
     * should write more tests of your own.
     *
     * && is the "and" operation. */
    public void addIsEmptySizeTest() {

        System.out.println("Make sure to uncomment the lines below (and delete this print statement)." +
                " The code you submit to the AG shouldn't have any print statements!");

        assertTrue("A newly initialized LLDeque should be empty", ad.isEmpty());
        ad.addFirst(0);

        assertFalse("lld1 should now contain 1 item", ad.isEmpty());

        ad = new ArrayDeque<Integer>(); //Assigns lld equal to a new, clean LinkedListDeque!


    }

    /** Adds an item, removes an item, and ensures that dll is empty afterwards. */
    @Test
    public void addRemoveTest() {
        assertTrue("A newly initialized LLDeque should be empty", ad.isEmpty());
        ad.addFirst(5);
        assertFalse("lld should now contain 1 item", ad.isEmpty());
        ad.removeFirst();
        assertTrue("lld need to be empty", ad.isEmpty());
        ad = new ArrayDeque<Integer>();
    }
    /** Make sure that removing from an empty LinkedListDeque does nothing */
    @Test
    public void removeEmptyTest() {
        int size = ad.size();
        ad.removeFirst();
        assertEquals(size,ad.size());
    }
    /** Make sure your LinkedListDeque also works on non-Integer types */
    @Test
    public void multipleParamsTest() {
        ArrayDeque <String>  ad = new ArrayDeque <String> ();

        ad.addLast("stuff");

        String s = ad.removeLast();
    }
    /** Make sure that removing from an empty LinkedListDeque returns null */
    @Test
    public void emptyNullReturn() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        assertEquals( null, ad.removeFirst());
        assertEquals(null, ad.removeLast());
    }
    @Test
    public void big() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        int count = 0;
        while (count < 1000000) {
            ad.addLast(count);
            count = count + 1;
        }
    }
    @Test
    public void tiny() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addFirst(3);
        ad.addFirst(4);
        ad.addFirst(5);
        ad.addFirst(6);
        ad.addFirst(7);
        ad.addFirst(8);
        ad.addFirst(9);
        ad.removeLast();
    }
    @Test
    public void hi() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.isEmpty();
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addFirst(3);
        ad.removeFirst();
    }
    @Test
    public void my_name() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        int x;
        ad.isEmpty();
        ad.isEmpty();
        ad.isEmpty();
        ad.isEmpty();
        ad.isEmpty();
        ad.addFirst(5);
        ad.addFirst(6);
        ad.removeLast();
        ad.removeLast();
        ad.isEmpty();
        ad.removeLast();
        ad.removeLast();
        ad.isEmpty();
        ad.addFirst(10);
        assertEquals(10,(int) ad.removeLast());
    }
    @Test
    public void is_burger() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.addLast(0);
        ad.removeLast();
        ad.addFirst(2);
        ad.removeLast();
        ad.addFirst(4);
        ad.removeFirst();
        ad.addFirst(6);
        ad.removeLast();
        ad.addLast(8);
        ad.addLast(9);
        ad.removeFirst();
        ad.get(0);
        ad.get(0);
        ad.removeFirst();
        ad.addFirst(14);
        ad.get(0);
        ad.addLast(16);
        ad.addLast(17);
        ad.removeLast();
        ad.removeLast();
        assertEquals(14,(int) ad.removeFirst());
    }

}



