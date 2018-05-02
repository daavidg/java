package herencia;

public class Colegio extends Edificio{//Extends= Colegio es hija de Edificio
	private int numeroAulas;
	private boolean pabellon;
	public Colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral, int numeroAulas, boolean pabellon) {
		super(direccion, codigoPostal, altura, calefaccionCentral);
		this.numeroAulas = numeroAulas;
		// Esto, no se pondría "this.pabellon = pabellon;"
	}
	public int getCapacidadColegio(){
	int capacidadColegio=numeroAulas*30;
	return (capacidadColegio);
	}
	
	public boolean getPabellon() {
		return pabellon;
	}
	public void setPabellon(boolean pabellon) {
		this.pabellon = pabellon;
	}
}
