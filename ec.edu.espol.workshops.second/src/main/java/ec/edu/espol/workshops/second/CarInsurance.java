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
	
	public int getPremium() {
		int base = 500;
		if (this.sexo=='M' && this.marital==false && this.Age<=25) {
			return base + 1500;
			
		}
		if (this.sexo=='F' || this.marital==false) {
			return base - 200;
		}
		if (this.Age>=45 && this.Age<65) {
			return base -100;
			
		}
		
	}
	
	
	public static void main(String [] args) {
		CarInsurance user1 = new CarInsurance("M",23,false);
		System.out.println(user1.getPremium())
	}

	
	
}
