import java.util.*;

public class TestVector{
	public static void main(String[] args){
		Vector list = new Vector();
		list.addElement(new Employee(1, "Ivanov"));
		list.addElement(new Employee(2, "Petrov"));
		list.addElement(new Employee(3, "Yrys_NM"));

		Employee employee = new Employee();

		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				employee = (Employee)list.elementAt(i);
				System.out.println(employee.toString());
			}
		}

		try {
			System.in.read();
		}catch(java.io.IOException e) {}  
	}
}

class Employee {
	public int  id;
	public String lastName;

	Employee() {

	}

	Employee(int id, String lastName) {
		this.id = id;
		this.lastName= lastName;
	}

	public String toString() {
		return "id " + " " + id + "\nLast name " + lastName;
	}

}