package empinh;

public class ConsultantEmployee extends Employee {

	int nohrs;
	float rate;

	public ConsultantEmployee() {
		
	}

	public ConsultantEmployee(int id, String name, int nohrs, float rate) {
		super(id, name);
		this.nohrs = nohrs;
		this.rate = rate;
	}

	void CalculateSalary() {

		salary = nohrs * rate;
	}

	void print() {
		super.print();

	}

}
