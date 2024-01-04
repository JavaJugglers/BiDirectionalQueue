package deque;

import org.junit.Test;
import static org.junit.Assert.*;


/** Performs some basic linked list deque tests. */
public class LinkedListDequeTest {

    /** You MUST use the variable below for all of your tests. If you test
     * using a local variable, and not this static variable below, the
     * autograder will not grade that test. If you would like to test
     * LinkedListDeques with types other than Integer (and you should),
     * you can define a new local variable. However, the autograder will
     * not grade that test. Please do not import java.util.Deque here!*/

    public static Deque<Integer> lld = new LinkedListDeque<Integer>();

    @Test
    /** Adds a few things to the list, checks that isEmpty() is correct.
     * This is one simple test to remind you how junit tests work. You
     * should write more tests of your own.
     *
     * && is the "and" operation. */
    public void addIsEmptySizeTest() {

        System.out.println("Make sure to uncomment the lines below (and delete this print statement)." +
                " The code you submit to the AG shouldn't have any print statements!");

		assertTrue("A newly initialized LLDeque should be empty", lld.isEmpty());
		lld.addFirst(0);

        assertFalse("lld1 should now contain 1 item", lld.isEmpty());

        lld = new LinkedListDeque<Integer>(); //Assigns lld equal to a new, clean LinkedListDeque!


    }

    /** Adds an item, removes an item, and ensures that dll is empty afterwards. */
    @Test
    public void addRemoveTest() {
        assertTrue("A newly initialized LLDeque should be empty", lld.isEmpty());
        lld.addFirst(5);
        assertFalse("lld should now contain 1 item", lld.isEmpty());
        lld.removeFirst();
        assertTrue("lld need to be empty", lld.isEmpty());
        lld = new LinkedListDeque<Integer>();
    }
    /** Make sure that removing from an empty LinkedListDeque does nothing */
    @Test
    public void removeEmptyTest() {
        int size = lld.size();
        lld.removeFirst();
        assertEquals(size,lld.size());
    }
    /** Make sure your LinkedListDeque also works on non-Integer types */
    @Test
    public void multipleParamsTest() {
        LinkedListDeque <String>  lld = new LinkedListDeque <String> ();

        lld.addLast("stuff");

        String s = lld.removeLast();
    }
    /** Make sure that removing from an empty LinkedListDeque returns null */
    @Test
    public void emptyNullReturn() {
        LinkedListDeque<Integer> lld = new LinkedListDeque<Integer>();

        assertEquals( null, lld.removeFirst());
        assertEquals(null, lld.removeLast());
    }
    @Test
    public void big() {
        LinkedListDeque<Integer> lld = new LinkedListDeque<Integer>();
        int count = 0;
        while (count < 1000000) {
            lld.addLast(count);
            count = count + 1;
        }
    }
    @Test
    public void thor() {
        LinkedListDeque<Integer> lld = new LinkedListDeque<Integer>();
        lld.addFirst(0);
        lld.addFirst(1);
        lld.addFirst(2);
        lld.removeLast();
        lld.addFirst(4);
        lld.addFirst(5);
        lld.addFirst(6);
        lld.removeLast();

    }
    @Test
    public void spiderman() {
        LinkedListDeque<Integer> lld = new LinkedListDeque<Integer>();
        lld.addLast(0);
        lld.addLast(1);
        lld.removeFirst();
        lld.addLast(2);
        lld.removeFirst();

    }
    @Test
    public void wholefood() {
        LinkedListDeque<Integer> lld = new LinkedListDeque<Integer>();
        lld.addFirst(1);
        lld.addFirst(2);
        lld.addFirst(3);
        lld.addFirst(4);
        lld.get(0);
        lld.get(1);
        lld.get(2);
        lld.get(3);
        lld.get(4);

    }
    @Test
    public void glasses() {
        LinkedListDeque<LinkedListDeque> lld = new LinkedListDeque<LinkedListDeque>();
        LinkedListDeque<LinkedListDeque> lld1 = new LinkedListDeque<LinkedListDeque>();
        LinkedListDeque<Integer> lld2 = new LinkedListDeque<Integer>();
        LinkedListDeque<Integer> lld3 = new LinkedListDeque<Integer>();

        lld2.addFirst(1);
        lld3.addFirst(1);
        lld.addFirst(lld2);


        lld1.addFirst(lld3);


        assertTrue(lld.equals(lld1));

    }
}
