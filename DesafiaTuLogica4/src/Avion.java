
public class Avion {

	private int idAvion, capAvion; 
	private String modAvion; 
	private Piloto piloto; 
	
	
	
	public int getIdAvion() {
		return idAvion;
	}



	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}



	public int getCapAvion() {
		return capAvion;
	}



	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}



	public String getModAvion() {
		return modAvion;
	}



	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}



	public Piloto getPiloto() {
		return piloto;
	}



	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}


	public Avion(int idAvion, int capAvion, String modAvion, Piloto piloto) {
		super();
		this.idAvion = idAvion;
		this.capAvion = capAvion;
		this.modAvion = modAvion;
		this.piloto = piloto;
	}

	

	public void mostrarAvion() {
		
		System.out.println("Información del Avión ");
		System.out.println("ID: "+idAvion);
		System.out.println("Capacidad: "+capAvion);
		System.out.println("Modelo: "+modAvion);
		System.out.println("Piloto asignado: ");
		piloto.mostrarPiloto();
	
	}
	
	
}
