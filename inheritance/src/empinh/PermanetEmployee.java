package empinh;

public class PermanetEmployee extends Employee {

	float basesalary;
	float da, hra;

	PermanetEmployee() {

	}

	PermanetEmployee(int id, String name, float basesalary) {
		super(id, name);
		this.basesalary = basesalary;
	}

	void CalculateSalary() {
		da = (this.basesalary * 15) / 100;
		hra = (this.basesalary * 20) / 100;
		salary = this.basesalary + this.da + this.hra;
	}

	void print() {
		super.print();
	}

}
