public class SeleccionFutbol
{

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
      public SeleccionFutbol(int id,String nombre , String apellidos, int edad){
       this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    public void concentrarse() {
        System.out.print("el plantel completo se concentro en el hotel");
    }

    public void viajar() {
                System.out.print("el plantel volvio al pais, eliminado :(");

    }
    
    public void pruebaCovid(){
                System.out.print("nuestro unico buen jugador salio positivo, vaya suerte");

    }
}
