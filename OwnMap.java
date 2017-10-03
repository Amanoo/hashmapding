import java.util.Vector;

/**
 * Created by marco on 08/09/17.
 */
public class OwnMap<T> implements OwnMapInterface<T>{
    private Vector<OwnElement<T>> myVector;
    public <T> OwnMap(){
        myVector= new Vector<>(10, 10);
    }


    @Override
    public int add(OwnElement<T> element1) {
        int i=0;
        int isValid = element1.getKey();
        while(i<myVector.size()&&isValid!=-1){
            if(myVector.get(i).getKey()==element1.getKey()){
                isValid=-1;
            }
            i++;
        }
        if(isValid!=-1){
            myVector.add(element1);
        }
        return isValid;
    }

    @Override
    public OwnElement<T> remove(int key){
        int i=0;
        boolean isFound = false;
        OwnElement element=null;
        while(i<myVector.size()&&!isFound){
            if(myVector.get(i).getKey()==key){
                isFound=true;
                element=myVector.get(i);
                myVector.remove(i);
            }
            i++;
        }
        return element;
    }

    @Override
    public int size(){
        return myVector.size();
    }

    @Override
    public boolean isEmpty(){
        return myVector.isEmpty();
    }

    @Override
    public OwnElement<T> get(int key){
        OwnElement result = null;
        boolean found = false;
        int i = 0;
        while(!found&&i<myVector.size()){
            if(myVector.get(i).getKey()==key){
                found=true;
                result=myVector.get(i);
            }else{
                i++;
            }
        }
        return result;
    }

    @Override
    public void print(){
        for(int i = 0; i<myVector.size(); i++)System.out.println(myVector.get(i).getKey()+"\t"+myVector.get(i).getValue());
    }
}
