
public class Entrenador extends SeleccionFutbol
{
    private boolean fuejugador;
    private String idFederacion;
        public Entrenador(String idFederacion,int id, String nombre, String apellidos, int edad) {
        super(id,nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }


    public String dirigirPartido() {
        String resul="";
         if(edad<60){
             resul="dirigio el partido con normalidad";
             
         }else{
           resul="esta muy mayor, busque otro DT";
           }
           return resul;
    }

}
