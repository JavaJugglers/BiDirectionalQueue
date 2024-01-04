package deque;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxArrayDequeTest {
    @Test
    public void more() {
        MaxArrayDeque<Integer> ad = new MaxArrayDeque<Integer> (null);
        ad.isEmpty();
        ad.addLast(1);
        ad.addLast(2);
        ad.addLast(3);
        ad.addLast(1);
        ad.addLast(1);
        ad.addLast(1);
        ad.addLast(1);
        ad.addLast(1);
        ad.addLast(100);
        int x = ad.removeFirst();
        int y = ad.removeFirst();
    }
    @Test
    public void Twice() {
        MaxArrayDeque<Integer> ad = new MaxArrayDeque<Integer> (null);
        ad.addLast(0);
        assertEquals(0,(int) ad.get(0));
        ad.addLast(2);
        assertEquals(2,(int) ad.removeLast());
        ad.addLast(4);
        ad.addLast(5);
        ad.addLast(6);
        ad.addLast(7);
        assertEquals(6,(int) ad.get(3));
        assertEquals(4,(int) ad.get(1));
        assertEquals(7,(int) ad.removeLast());
        ad.addLast(11);
        ad.addLast(12);
        assertEquals(11,(int) ad.get(4));
        ad.addLast(14);
        assertEquals(12,(int) ad.get(5));
        ad.addFirst(16);
        ad.addFirst(17);
        ad.addFirst(18);
        assertEquals(14,(int) ad.removeLast());
    }
    @Test
    public void suffering_under_pressure() {
        MaxArrayDeque<Integer> ad = new MaxArrayDeque<Integer> (null);
        int x = 0;
        ad.addFirst(0);
        x=ad.removeFirst();
        ad.addFirst(2);
        x=ad.removeFirst();
        ad.addLast(4);
        x=ad.removeLast();
        ad.addFirst(6);
        x=ad.removeFirst();
        ad.addLast(8);
        x=ad.get(0);
        ad.addLast(10);
        ad.addLast(11);
        x=ad.removeFirst();
        x=ad.get(1);
        x=ad.get(1);
        x=ad.removeFirst();
        x=ad.removeLast();
        ad.addLast(17);
        assertEquals(17,(int) ad.get(0));

    }
    @Test
    public void why_am_I_here_just_to_suffer() {
        MaxArrayDeque<Integer> ad = new MaxArrayDeque<Integer> (null);
        int x;
        ad.addLast(4);
        ad.addLast(3);
        x=ad.removeFirst();
        x=ad.removeFirst();
        assertEquals(true,ad.isEmpty());
    }
}
