package CollectionFramework;

public class EqualsT1Obj {
public static void main(String[] args) {
	EqualMethodT1 tst=new EqualMethodT1("moseen", 101);
	EqualMethodT1 tst2=new EqualMethodT1("moseen", 101);
	
	System.out.println(tst.equals(tst2));
	
}
}
