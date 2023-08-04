package CollectionFramework;

public class EqualMethodT1 {
	String name;
	int id;
	public EqualMethodT1(String name ,  int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public boolean equals(Object obj) {
		EqualMethodT1 that = (EqualMethodT1) obj;
		boolean isequals=this.name.equals(that.name) && this.id == that.id;
		return (isequals);
	}
     
}
