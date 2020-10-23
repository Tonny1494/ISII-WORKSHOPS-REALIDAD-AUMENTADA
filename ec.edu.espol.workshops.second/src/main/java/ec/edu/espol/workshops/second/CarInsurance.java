package ec.edu.espol.workshops.second;

public class CarInsurance {
	public char sexo;
	public int  Age ;
	public boolean marital;
	
	public CarInsurance(char sexo, int age, boolean marital) {
		super();
		this.sexo = sexo;
		Age = age;
		this.marital = marital;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public boolean isMarital() {
		return marital;
	}

	public void setMarital(boolean marital) {
		this.marital = marital;
	}

	
	
}
