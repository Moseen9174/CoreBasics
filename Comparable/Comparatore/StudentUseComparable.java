package Comparable.Comparatore;

public class StudentUseComparable {

	private String name="null";
	private int roll=0;
	private String collage="null";
	
	public StudentUseComparable(String name,int roll, String collage) {
		this.collage=collage;
		this.name=name;
		this.roll=roll;
		
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+roll+" "+collage;
	}
}
