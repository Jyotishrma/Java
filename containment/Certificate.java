package containment;

public class Certificate {
	
	private String name;
	private String grade;
	private String inistitute;
	
	
	public Certificate() {
			// TODO Auto-generated constructor stub
		}


	public Certificate(String name, String grade, String inistitute) {
		super();
		this.name = name;
		this.grade = grade;
		this.inistitute = inistitute;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getInistitute() {
		return inistitute;
	}


	public void setInistitute(String inistitute) {
		this.inistitute = inistitute;
	}
	
	void print() {
		System.out.println("Institution Name=" + inistitute);
		System.out.println("Certificate Name=" + name);
		System.out.println("Certificate Grade=" + grade);
}
}
