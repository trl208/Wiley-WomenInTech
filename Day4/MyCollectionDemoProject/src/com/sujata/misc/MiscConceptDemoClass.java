package com.sujata.misc;

class Person{
	private int pId;
	private String pName;
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pId;
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (pId != other.pId)
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		return true;
	}
	
	
}
public class MiscConceptDemoClass {

	public static void main(String[] args) {
		int i=10;
		System.out.println("i : "+i);

		Person p=new Person(111, "AAAAA");
		System.out.println("p : "+p/*.toString()*/); //Implicit call happens to toString() whenever we are trying to print object with System.out.print()
		
	}

}