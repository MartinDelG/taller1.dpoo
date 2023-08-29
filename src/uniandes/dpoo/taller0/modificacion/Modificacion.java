package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	 public static void main(String[]args)
	{
		 CalculadoraEstadisticas calc = null;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
		}
		 System.out.println(calc.paisConMasMedallistas());
	}
	 
}
