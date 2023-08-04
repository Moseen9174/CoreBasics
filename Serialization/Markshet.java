package Serialization;

import java.io.Serializable;

public class Markshet implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public int roll;
  public String name;
 public transient int marks;
}
