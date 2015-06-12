package sem11;

public class Familie {
	private Persoana sot;
	private Persoana sotie;
	public Persoana getSot() {
		return sot;
	}
	public void setSot(Persoana sot) {
		this.sot = sot;
	}
	public Persoana getSotie() {
		return sotie;
	}
	public void setSotie(Persoana sotie) {
		this.sotie = sotie;
	}
	
	public boolean checkFamilie(){
		if(sot.getVarsta()<18 || sotie.getVarsta()<18 || sot.getSex().equals("F") || sotie.getSex().equals("M")){
			return false;
		}
		return true;
	}
	
	public int diferenta(){
		return Math.abs(sot.getVarsta() - sotie.getVarsta());
	}

}
