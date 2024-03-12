import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		Piloto piloto1 = new Piloto (76549,10000,"Pete Maverick","capitán");
		Piloto piloto2 = new Piloto (58393,3000,"Natasha Phoenix","teniente");
		Piloto piloto3 = new Piloto (84975,3500,"Bradley Rooster","teniente");
		
		piloto1.mostrarPiloto();
		System.out.println("\n----------------------\n");
		piloto2.mostrarPiloto();
		System.out.println("\n----------------------\n");
		piloto3.mostrarPiloto();
		
		
		
		Scanner sc = new Scanner(System.in); 
		
		int idPiloto4, idPiloto5, horasVueloPiloto4, horasVueloPiloto5; 
		String nomPiloto4, nomPiloto5, rangoPiloto4, rangoPiloto5;
		
		System.out.println("------------------------------------------------------");

		
		System.out.println("\nIntroduce dos nuevos Pilotos ");
		
		System.out.print("\nPILOTO 4 \n\nNombre: ");
		nomPiloto4 = sc.next();

		System.out.print("ID: ");
		idPiloto4 = sc.nextInt();
		
		System.out.print("Horas de vuelo realizadas: ");
		horasVueloPiloto4 = sc.nextInt();

		System.out.print("Rango: ");
		rangoPiloto4 = sc.next();
		
		
		System.out.println("------------------------------------------------------");

		
		System.out.print("\nPILOTO 5 \n\nNombre: ");
		nomPiloto5 = sc.next();

		System.out.print("ID: ");
		idPiloto5 = sc.nextInt();
		
		System.out.print("Horas de vuelo realizadas: ");
		horasVueloPiloto5 = sc.nextInt();

		System.out.print("Rango: ");
		rangoPiloto5 = sc.next();

		Piloto piloto4 = new Piloto (idPiloto4, horasVueloPiloto4, nomPiloto4, rangoPiloto4);
		Piloto piloto5 = new Piloto (idPiloto5, horasVueloPiloto5, nomPiloto5, rangoPiloto5);
		
		System.out.println("\n----------------------\n");
		piloto4.mostrarPiloto();
		System.out.println("\n----------------------\n");
		piloto5.mostrarPiloto();
		
	
		//Objeto de tipo avion (1 de entrenamiento y 2 de combate) 
		
		int idAvionEnt2, idAvionEnt3, capAvionEnt2, capAvionEnt3; 
		String modAvionEnt2, modAvionEnt3, pilotoAvionEnt2, pilotoAvionEnt3;
		boolean dobleMandoAvionEnt2, dobleMandoAvionEnt3;
		
		Entrenamiento avionEnt1 = new Entrenamiento (2423,45,"Cessna Skyhawk", piloto5, true);
		Combate avionCombate1 = new Combate (6362,32,"F-22 Raptor", piloto3, false);
		Combate avionCombate2 = new Combate (3523,38,"Dassault Rafale", piloto4, true);
		
		
		
		
System.out.println("------------------------------------------------------");

		
		System.out.println("\nIntroduce dos nuevos Aviones de Entrenamiento ");
		
		System.out.print("\nAvion de Entrenamiento 2 \n\nID: ");
		idAvionEnt2 = sc.nextInt();

		System.out.print("Capacidad: ");
		capAvionEnt2 = sc.nextInt();
		
		System.out.print("Modelo: ");
		modAvionEnt2 = sc.next();
		
		System.out.print("¿Tiene doble mando este avion? (Escribe true o false)");
		dobleMandoAvionEnt2 = sc.nextBoolean();
		
		System.out.print("Del 1 al 5, ¿que piloto quieres añadir?");
		int numPiloto1 = sc.nextInt();
		Entrenamiento avionEnt2=null;
		switch (numPiloto1) {
			case 1: {
				avionEnt2 = new Entrenamiento(idAvionEnt2, capAvionEnt2, modAvionEnt2, piloto1, dobleMandoAvionEnt2);
				break;
			} case 2: {
				avionEnt2 = new Entrenamiento(idAvionEnt2, capAvionEnt2, modAvionEnt2, piloto2, dobleMandoAvionEnt2);
				break;
			} case 3:{
				avionEnt2 = new Entrenamiento(idAvionEnt2, capAvionEnt2, modAvionEnt2, piloto3, dobleMandoAvionEnt2);
				break;
			} case 4:{
				avionEnt2 = new Entrenamiento(idAvionEnt2, capAvionEnt2, modAvionEnt2, piloto4, dobleMandoAvionEnt2);
				break;
			} case 5:{
				avionEnt2 = new Entrenamiento(idAvionEnt2, capAvionEnt2, modAvionEnt2, piloto5, dobleMandoAvionEnt2);
				break;
			} default:
				System.out.println("Ha elegido a un piloto inexistente");
				
		}
		
		
		System.out.println("------------------------------------------------------");
		
		

		
		System.out.print("\nAvion de Entrenamiento 3 \n\nID: ");
		idAvionEnt3 = sc.nextInt();

		System.out.print("Capacidad: ");
		capAvionEnt3 = sc.nextInt();
		
		System.out.print("Modelo: ");
		modAvionEnt3 = sc.next();

		System.out.print("¿Tiene doble mando este avion? (Escribe true o false)");
		dobleMandoAvionEnt3 = sc.nextBoolean();
		
		System.out.print("Del 1 al 5, ¿que piloto quieres añadir?");
		int numPiloto2 = sc.nextInt();
		Entrenamiento avionEnt3=null;
		switch (numPiloto2) {
			case 1: {
				avionEnt3 = new Entrenamiento(idAvionEnt3, capAvionEnt3, modAvionEnt3, piloto1, dobleMandoAvionEnt3);
				break;
			} case 2: {
				avionEnt3 = new Entrenamiento(idAvionEnt3, capAvionEnt3, modAvionEnt3, piloto2, dobleMandoAvionEnt3);
				break;
			} case 3:{
				avionEnt3 = new Entrenamiento(idAvionEnt3, capAvionEnt3, modAvionEnt3, piloto3, dobleMandoAvionEnt3);
				break;
			} case 4:{
				avionEnt3 = new Entrenamiento(idAvionEnt3, capAvionEnt3, modAvionEnt3, piloto4, dobleMandoAvionEnt3);
				break;
			} case 5:{
				avionEnt3 = new Entrenamiento(idAvionEnt3, capAvionEnt3, modAvionEnt3, piloto5, dobleMandoAvionEnt3);
				break;
			} default:
					System.out.println("Ha elegido a un piloto inexistente");
			}



	
		System.out.println("\n----------------------\n");
		avionCombate1.mostrarAvion();
		System.out.println("\n----------------------\n");
		avionCombate2.mostrarAvion();
		System.out.println("\n----------------------\n");
		avionEnt1.mostrarAvion();
		System.out.println("\n----------------------\n");
		avionEnt2.mostrarAvion();
		System.out.println("\n----------------------\n");
		avionEnt3.mostrarAvion();
		System.out.println("\n----------------------\n");

		//Aquí había puesto los otros dos aviones que introduce el usuario. (pero me saltaba error) 
				
		

		
		
		
	}

}
