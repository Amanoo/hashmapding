/**
 * Created by marco on 22/09/17.
 */
public class OwnHashMap<T> implements OwnMapInterface {
    int size;
    OwnMap<OwnMap<T>> bucketList;
    OwnHashMap(int size){
        bucketList = new OwnMap<>();
        this.size=size;
        for(int i =0; i<size;i++){
            bucketList.add(new OwnElement<>(i, new OwnMap()));
        }
    }

    int firstPartKey(int key){
        return key%size;
    }

    int secondPartKey(int key){
        return key;
    }

    @Override
    public int add(OwnElement element1) {
        return ((OwnMap)bucketList.get(firstPartKey(element1.getKey())).getValue()).add(element1);
    }

    @Override
    public OwnElement remove(int key) {
        int i=0;
        OwnElement element = null;
        while(i<size && element == null){
            element=((OwnMap)bucketList.get(i).getValue()).remove(key);
            i++;
        }
        return element;
    }

    @Override
    public int size() {

        int numberOfElements =0;
        for(int i =0; i<size;i++){
            numberOfElements += ((OwnMap)bucketList.get(i).getValue()).size();
        }
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        boolean empty=true;
        for(int i =0; i<size;i++){
            if(!((OwnMap)bucketList.get(i).getValue()).isEmpty()){
                empty=false;
            }
        }
        return empty;
    }

    @Override
    public OwnElement get(int key) {
        int i=0;
        OwnElement element = null;
        while(i<size && element == null){
            if(((OwnMap)bucketList.get(i).getValue()).get(key)!=null);
            element=((OwnMap)bucketList.get(i).getValue()).get(key);
            i++;
        }
        return element;
    }

    @Override
    public void print() {
        for(int i =0; i<size;i++){
            System.out.println("BucketList "+i+":");
            ((OwnMap)bucketList.get(i).getValue()).print();
        }
    }
}
