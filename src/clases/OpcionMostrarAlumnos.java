package clases;

public class OpcionMostrarAlumnos  implements IOpcionMenu {

	@Override
	public void ejecutar(GestorAlumnos gestorAlumnos) {
		// TODO Auto-generated method stub
		// Mostrar la lista de alumnos utilizando GestorAlumnos
        gestorAlumnos.listarAlumnos();

	}

}
