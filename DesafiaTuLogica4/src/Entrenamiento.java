
public class Entrenamiento extends Avion{

	private boolean tieneDobleMando;

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}

	public Entrenamiento(int idAvion, int capAvion, String modAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, capAvion, modAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}
	
	

	
	
	
}
