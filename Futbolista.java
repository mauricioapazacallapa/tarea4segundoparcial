import java.util.ArrayList;

public class Futbolista extends SeleccionFutbol
{
    private int dorsal;
    private String demarcacion;
    private boolean estado = true;
    private ArrayList<Futbolista>f;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion, boolean estado) {
        super(id,nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        this.estado=estado;
    }
    
    public String jugarPartido() {
               String respuesta;
               if(estado){
               respuesta="puede jugar el partido";
               }else{
               respuesta="esta lesionado";
               }
               return respuesta;
    }

    public boolean entrenar() {
        boolean resp=true;
        int contador=0;
        while(contador<10){
           resp=true;
           contador++;
        }
        return resp;
        }
}