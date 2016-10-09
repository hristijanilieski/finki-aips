
public class Atleticar {
	private String name;
	private String gender;
	private int age;
	private double time;
	private String contry;
	
	public Atleticar(){}
	public Atleticar(String name, String gender, int age, double time, String contry){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.time = time;
		this.contry = contry;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setTime(double time){
		this.time = time;
	}
	public void setContry(String contry){
		this.contry = contry;
	}
	public String getName(){
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public int getAge(){
		return this.age;
	}
	public double getTime(){
		return this.time;
	}
	public String getContry(){
		return this.contry;
	}
	public String toString(){
		return this.name+" "+this.age+" "+this.contry+" "+this.time+"\n";
	}
}
