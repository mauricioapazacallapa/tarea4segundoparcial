
public class Masajista extends SeleccionFutbol
{

	private String Titulacion;
	private int añosExperiencia;

        public Masajista(int id, String nombre, String apellidos, int edad) {
		super(id,nombre, apellidos, edad);
	}

	public void darMasaje(Futbolista f) {
	   for(int i=0; i<23;i++){
        	   if(f.entrenar()){
        	   System.out.println("se realizo el mazaje");
        	   }else{
                   System.out.println("no se realizo el masaje xq no entreno");

        	   }
	   }
	  
	}
}