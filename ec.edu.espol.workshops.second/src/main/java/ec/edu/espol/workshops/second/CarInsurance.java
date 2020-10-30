package ec.edu.espol.workshops.second;
public class CarInsurance {
   public char sexo;
   public int  age;
   public boolean marital;
   public CarInsurance(char sexo, int age, boolean marital) {
    super();
	this.sexo=sexo;
	this.age=age;
	this.marital =marital;
}
  public CarInsurance(String string, int age2, boolean marital2) {
   //TODO Auto-generated constructor stub
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age=age;
  }

  public boolean isMarital() {
    return marital;
  }

  public void setMarital(boolean marital) {
    this.marital=marital;
  }
	
  public int getPremium() {
    int base=500;
	if (this.sexo=='M' && this.marital==false && this.age<=25) {
      return base + 1500;
  }
  if (this.sexo=='F' || this.marital==false) {
    return base-200;
  }
  if (this.age>=45 && this.age<65) {
    return base-100;
			
  }
	return base;
		
  }
  public static void main(String [] args) {
    CarInsurance user1=new CarInsurance("M" , 23 , false);
	user1.getPremium();
  }	
}
