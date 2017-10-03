/**
 * Created by marco on 29/09/17.
 */
public class test {
    public static void main(String[] args) {
        System.out.println("OwnMap\n");
        OwnMap<String> ownMapStrings = new OwnMap<String>();
        System.out.println("isEmpty: "+ownMapStrings.isEmpty());
        ownMapStrings.add(new OwnElement(242,"hfuewo"));
        ownMapStrings.add(new OwnElement(56,"fw"));
        ownMapStrings.add(new OwnElement(35,"het"));
        ownMapStrings.add(new OwnElement(7,"ke5y"));
        ownMapStrings.add(new OwnElement(532,new OwnElement<String>(53,"fbewgninofewnjioaewinoewain")));
        System.out.println("instanceof String: "+(ownMapStrings.get(532).getValue() instanceof  String));
        System.out.println("added key "+ownMapStrings.add(new OwnElement(637,"KTYKYT")));
        System.out.println("isEmpty: "+ownMapStrings.isEmpty()+"\n");
        ownMapStrings.print();
        System.out.println("\nownMapStrings.size()="+ownMapStrings.size());
        System.out.println("ownMapStrings.get(35).getValue()="+ownMapStrings.get(35).getValue());
        System.out.println("removed value "+ownMapStrings.remove(7).getValue());
        System.out.println("ownMapStrings.size()="+ownMapStrings.size()+"\n");
        ownMapStrings.print();
        System.out.println("\ntry to remove nonexistent value "+ownMapStrings.remove(654)+"\n\n");

        System.out.println("OwnHashMap\n");
        OwnHashMap<String> stringsOwnHashMap = new OwnHashMap<>(10);
        System.out.println("isEmpty: "+stringsOwnHashMap.isEmpty());
        stringsOwnHashMap.add(new OwnElement(242,"hfuewo"));
        stringsOwnHashMap.add(new OwnElement(56,"fw"));
        stringsOwnHashMap.add(new OwnElement(35,"het"));
        stringsOwnHashMap.add(new OwnElement(7,"ke5y"));
        stringsOwnHashMap.add(new OwnElement(532,"R"));
        System.out.println("added key "+stringsOwnHashMap.add(new OwnElement(637,"KTYKYT")));
        System.out.println("isEmpty: "+stringsOwnHashMap.isEmpty()+"\n");
        stringsOwnHashMap.print();
        System.out.println("\nstringsOwnHashMap.size()="+stringsOwnHashMap.size());
        System.out.println("stringsOwnHashMap.get(35).getValue()="+stringsOwnHashMap.get(35).getValue());
        System.out.println("removed value "+stringsOwnHashMap.remove(7).getValue());
        System.out.println("stringsOwnHashMap.size()="+stringsOwnHashMap.size()+"\n");
        stringsOwnHashMap.print();
        System.out.println("\ntry to remove nonexistent value "+stringsOwnHashMap.remove(654));
    }
}
