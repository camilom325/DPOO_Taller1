package uniandes.dpoo.taller0.modificacion;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class Modificacion {
	public static void main(String[] args) {
        System.out.println("Hola, mundo!");
        System.out.println();
        
        CalculadoraEstadisticas calc = null;
        
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println("\nSe cargó correctamente la información de \"atletas.csv\" \n");
		} 
		catch (IOException e) {
			System.out.println("ERROR: hubo un problema leyendo el archivo.\n");
			System.out.println(e.getMessage());
		} 
		System.out.print("El país con más medallistas es ");
		
		Map<String, Integer> MyMap = calc.paisConMasMedallistas();
		for (String keys : MyMap.keySet()) {
            System.out.print(keys);
            System.out.print(" con ");
            System.out.print(MyMap.get(keys));
            System.out.println(" medallas\n");
        }
        System.out.println(MyMap);
        
    }
}
