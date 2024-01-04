package deque;

public class LinkedListDeque <T> implements Deque <T> {
    private int size;
    private DequeNode sentient;
    private DequeNode sentient_last;

    private class DequeNode {
        public T item;
        public DequeNode next;

        public DequeNode prev;

        public DequeNode(T i, DequeNode n, DequeNode r) {
            item = i;
            next = n;
            prev = r;
        }
    }

    public LinkedListDeque() {
        sentient = new DequeNode(null, null, null);
        sentient_last = sentient;


    }

    @Override
    public void addFirst(T item) {
        size = size + 1;
        if (this.sentient.next == null) {
            this.sentient.next = new DequeNode(item, this.sentient.next, this.sentient);
            this.sentient_last = this.sentient.next;
        } else {
            this.sentient.next = new DequeNode(item, this.sentient.next, this.sentient);
            this.sentient.next.next.prev = this.sentient.next;
        }


    }

    @Override
    public T removeFirst() {

        if (size == 0) {
            return null;
        } else if (size == 1) {
            T a = this.sentient.next.item;
            this.sentient.next.prev = null;
            this.sentient.next = null;
            this.sentient_last = this.sentient;
            size = size - 1;
            return a;
        } else {
            T a = this.sentient.next.item;
            this.sentient.next.prev = null;
            this.sentient.next = this.sentient.next.next;
            this.sentient.next.prev = this.sentient;
            this.sentient.next = this.sentient.next;

            size = size - 1;
            return a;
        }


    }

    @Override
    public void addLast(T item) {
        size = size + 1;
        this.sentient_last.next = new DequeNode(item, this.sentient_last.next, this.sentient_last);
        this.sentient_last = this.sentient_last.next;

    }

    @Override
    public T removeLast() {
        if (size == 0) {
            return null;

        } else {
            T a = this.sentient_last.item;
            this.sentient_last = this.sentient_last.prev;
            this.sentient_last.next = null;
            size = size - 1;
            return a;
        }


    }



    @Override
    public void printDeque() {
        DequeNode arts = this.sentient.next;
        while (arts != null) {
            System.out.print(arts.item);
            System.out.print(' ');
            arts = arts.next;
        }

    }

    public T getRecursive(int index) {
        DequeNode now = this.sentient.next;
        return helper(now, index);
    }

    private T helper(DequeNode current, int index) {
        if (current == null) {
            return null;
        } else if (index == 0) {
            return current.item;
        } else {
            index = index - 1;
            current = current.next;
            return helper(current, index);
        }

    }

    @Override
    public T get(int index) {
        if ((size - 1) < index) {
            return null;

        } else {
            int x = index;
            DequeNode a = this.sentient.next;
            while (a != null) {
                if (x == 0) {
                    T y = a.item;
                    return y;
                } else {
                    x = x - 1;
                    a = a.next;
                }

            }

        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if ((o instanceof Deque) == false) {
            return false;
        }
        Deque x = (Deque) o;
        if (x.size() != this.size()) {
            return false;
        }
        int count = 0;
        while (count < this.size()) {
            if ((this.get(count).equals(x.get(count))) == false) {
                return false;
            }
            else {
                count = count + 1;
            }
        }



        return true;
    }
}
