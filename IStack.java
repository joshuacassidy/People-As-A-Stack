
/**
 * Created by Josh on 08/11/2017.
 */
public interface IStack {
    public void push(Person data);
    public Node pop();
    public Node peek();
    public int size();
    public boolean isEmpty();
}
