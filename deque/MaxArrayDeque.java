package deque;

import java.util.Comparator;




public class MaxArrayDeque <T> extends ArrayDeque <T> {
    private Comparator pairings;

    public MaxArrayDeque(Comparator<T> c) {
        super();
        this.pairings = c;
    }
    public T max() {
        T maximum = null;
        int first_position = adding(first_next,this.items.length);
        int last_position = subbing(last_next,this.items.length);
        while (first_position <= last_position) {
            if (maximum == null) {
                maximum = this.items[first_position];
            }
            else if (this.pairings.compare(maximum,this.items[first_position]) == -1) {
                maximum = this.items[first_position];
            }
            first_position = adding(first_position,this.items.length);
        }
        return maximum;
    }
    public T max(Comparator<T> c) {
        T maximum = null;
        int first_position = adding(first_next,this.items.length);
        int last_position = subbing(last_next,this.items.length);
        while (first_position <= last_position) {
            if (maximum == null) {
                maximum = this.items[first_position];
            }
            else if (c.compare(maximum,this.items[first_position]) == -1) {
                maximum = this.items[first_position];
            }
            first_position = adding(first_position,this.items.length);
        }
        return maximum;
    }
}
/*
class Comparing <O> implements Comparator<O> {

    @Override
    public int compare(O o1, O o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.compareTo(o2);
    }
}
*/
