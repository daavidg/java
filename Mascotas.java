package mascotas;

public class ManejaMascotas {
	
	public static void main(String[] args) {
		Mascota Jazz;
		Jazz=new Mascota("Jazz",3,"perro",'h');
		System.out.println("Mi mascota se llama "+Jazz.getNombre());
		System.out.println("y tiene "+Jazz.getEdad() +" a�os");
		//pasa un a�o
		Jazz.setEdad(4);
		System.out.println("Ahora tiene "+Jazz.getEdad());
		System.out.println("por lo tanto naci� en el a�o "+Jazz.getAnioNacimiento(2018));
	}

}
