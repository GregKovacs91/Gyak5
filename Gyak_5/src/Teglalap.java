
public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	public Teglalap(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	
	}
	public Teglalap(int oldal){
		a_oldal = oldal;
		b_oldal = oldal;
	}
	int Terulet(){
		return a_oldal*b_oldal;
	}
	String Adatok(){
		return "A oldal = "+a_oldal+" , B oldal: "+b_oldal+" , és a terület: "+Terulet();
	}
	void setoldal(int a_oldal, int b_oldal){
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	void setoldal(int oldal){
		a_oldal = oldal;
		b_oldal = oldal;
	}
	boolean NagyobbTeruletu(Teglalap Masik){
		return Terulet () > Masik.Terulet();
	}
	boolean Egyforma(Teglalap Masik){
		return a_oldal==b_oldal && b_oldal ==Masik.b_oldal;
	}
	
}
