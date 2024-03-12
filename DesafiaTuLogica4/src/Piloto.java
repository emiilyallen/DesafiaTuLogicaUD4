
public class Piloto {

	private int idPiloto, horasVueloPiloto; 
	private String nomPiloto, rangoPiloto; 
	
	
	
	public int getIdPiloto() {
		return idPiloto;
	}



	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}



	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}



	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}



	public String getNomPiloto() {
		return nomPiloto;
	}



	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}



	public String getRangoPiloto() {
		return rangoPiloto;
	}



	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}



	public Piloto(int idPiloto, int horasVueloPiloto, String nomPiloto, String rangoPiloto) {
		super();
		this.idPiloto = idPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.nomPiloto = nomPiloto;
		this.rangoPiloto = rangoPiloto;
	}
	
	


	public void mostrarPiloto() {
		System.out.println("Nombre del Piloto: "+nomPiloto);
		System.out.println("ID: "+idPiloto);
		System.out.println("Horas de vuelo realizadas: "+horasVueloPiloto);
		System.out.println("Rango: "+rangoPiloto);
	
	}
}
