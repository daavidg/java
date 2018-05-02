package herencia;

public class ColegioInfantil extends Colegio{
	private boolean patio;

	public ColegioInfantil(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral, int numeroAulas, boolean pabellon, boolean patio) {
		super(direccion, codigoPostal, altura, calefaccionCentral, numeroAulas, pabellon);
	}

	public boolean getPatio() {
		return patio;
	}

	public void setPatio(boolean patio) {
		this.patio = patio;
	}
	
}
