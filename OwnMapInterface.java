/**
 * Created by marco on 22/09/17.
 */
public interface OwnMapInterface<T> {


    public int add(OwnElement<T> element1);

    public OwnElement<T> remove(int key);
    public int size();
    public boolean isEmpty();
    public OwnElement<T> get(int key);
    public void print();
}
