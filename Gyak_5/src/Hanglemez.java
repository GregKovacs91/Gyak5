
public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz_perc;
	
	public Hanglemez(String eloado, String cim, int hossz_perc){
		this.eloado = eloado;
		this.cim = cim;
		this.hossz_perc = hossz_perc;	
	}
	String Adatok(){
		return "Elõadó: "+eloado+" ,Cím: "+cim+" ,Hossza: "+hossz_perc;
	}
	
	int getHossz(){
		return hossz_perc;
	}
	int ellHossz(Hanglemez A){
		int vi = 0;
		if (hossz_perc > A.getHossz()) vi=1;
		if (hossz_perc < A.getHossz()) vi=-1;
		return vi;
	}
	boolean EllElado(String eloado){
		return eloado.equals(this.eloado);
	}
}
