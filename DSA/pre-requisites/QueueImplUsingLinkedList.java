import java.util.NoSuchElementException;

public class QueueImplUsingLinkedList<T> {
    private static class QueueNode<T> {
        T data;
        QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    QueueNode<T> first;
    QueueNode<T> last;

    public void add(T item) {
        QueueNode<T> node = new QueueNode<>(item);
        if (last != null) {
            last.next = node;
        }
        last = node;
        if (first == null)
            first = last;
    }

    public T remove() {
        if (first == null)
            throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null)
            last = null;
        return data;
    }

    public T peek() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
