/**
 * Created by marco on 08/09/17.
 */
public class OwnElement<T> {
    private int key;
    private T value;
    public OwnElement(int key){
        this.key = key;
        value=null;
    }
    public OwnElement(int key, T value){
        this.key = key;
        this.value=value;
    }

    public int getKey() {
        return key;
    }

    public T setValue(T value){
        this.value=value;
        return value;
    }

    public T getValue(){ return value; }

}
