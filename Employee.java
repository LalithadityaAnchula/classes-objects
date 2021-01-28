package employeeDetails;

public class Employee {
	
	public String name;
	public int yearOfJoining;
	public String address;
	
	public Employee(String name,int yearOfJoining,String address) {
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		this.address=address;
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Robert",1994,"64C-WallStreet");
		Employee emp2 = new Employee("Sam",2000,"68D-WallStreet");
		Employee emp3 = new Employee("John",1999,"26B-WallStreet");
		
		System.out.format("%20s%18s%26s\n","Name","Year Of Joining","Address"); //Heading for data..
		
		System.out.format("%20s%18d%26s\n",emp1.name,emp1.yearOfJoining,emp1.address);
		System.out.format("%20s%18d%26s\n",emp2.name,emp2.yearOfJoining,emp2.address);
		System.out.format("%20s%18d%26s\n",emp3.name,emp3.yearOfJoining,emp3.address);
	}

}
