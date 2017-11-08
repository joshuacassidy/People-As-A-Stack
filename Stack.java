/**
 * Created by Josh on 08/11/2017.
 */
public class Stack implements IStack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public void push(Person data) {
        Node newNode = new Node(data);
        size++;
        if (isEmpty()) {
            top = newNode;
        } else {
            Node oldTop = top;
            top = newNode;
            top.setNext(oldTop);
        }
    }

    @Override
    public Node pop() {
        if(isEmpty()){
            throw new StackEmptyException("No items in the stack to pop.");
        } else {
            Node oldTop = top;
            setTop(top.getNext());
            size--;
            return oldTop;
        }
    }

    public void setTop(Node top) {
        this.top = top;
    }

    @Override
    public Node peek() {
        if (isEmpty()) {
            throw new StackEmptyException("No items in the stack to peek.");
        } else {
            return top;
        }
    }

    @Override
    public int size() {
        return size;
    }

}
