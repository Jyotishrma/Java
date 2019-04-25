package containment;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private Certificate certificate;
	
	public Employee() {
		
	}
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	void print () {
		
		System.out.println("Emp id=" + id);
		System.out.println("Emp name=" + name);
		System.out.println("Emp salary=" + salary);
		certificate.print();
		
		
		
	}
}
