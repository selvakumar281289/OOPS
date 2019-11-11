package org.encapsulation;



/*1. creating structure of folders
2. wrap the data and code acting on a data together into a single unit.
3. Example of encapsulations is POJO.
4. here we can call our method name is "Getters and Setters".
*/


public class Encapsulation {

	private int empID;
	private String name;
	private long phoneNumber;
	private float salary;
	
	public void empID()
	{
		System.out.println("005811");
	}
	public void name() {
		System.out.println("Selvakumar");
	}
	public void phoneNumber() {
		System.out.println("8939700093");
	}
	public void salary() {
		System.out.println("22320.89f");
	}

	
	//Getters
	
	public int getempID() {
		return empID;
	}
	public String getname() {
		return name;
	}
	public long getphoneNumber() {
		return phoneNumber;
	}
	public float getsalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		Encapsulation po=new Encapsulation();
		po.empID();
		po.name();
		po.phoneNumber();
		po.salary();
		
		
		
	}
}

