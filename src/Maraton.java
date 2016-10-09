
public class Maraton implements IMaraton{
	
	private String place;
	private int year;
	private Atleticar[] atleticari;
	
	public Maraton(){
		atleticari = new Atleticar[100];
	}
	public Maraton(String place, int year, Atleticar atleticari[]){
		this.place = place;
		this.year = year;
		this.atleticari = atleticari;
	}
	public void setPlace(String place){
		this.place = place;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setAtlericari(Atleticar atleticari[]){
		this.atleticari = atleticari;
	}
	public String getPlace(){
		return this.place;
	}
	public int getYear(){
		return this.year;
	}
	public Atleticar[] getAtleticari(){
		return this.atleticari;
	}
	public String toString(){
		return this.place+"\n"+this.year+"\n"+najdobroVreme();
	}

	@Override
	public Atleticar najdobroVreme() {
		double time=atleticari[0].getTime();
		int counter=0;
		for(int i=1; i<atleticari.length; i++){
			if(atleticari[i].getTime() < time){
				time = atleticari[i].getTime();
				counter=i;
			}
		}
		return atleticari[counter];
	}

	@Override
	public int atleticariOd(String s) {
		int counter=0;
		for(int i=1; i<atleticari.length; i++){
			if(atleticari[i].getContry() == s){
				counter++;
			}
		}
		return counter;
	}

}
