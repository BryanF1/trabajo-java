package clase1;
public class cliente {
    String nombre;
    String apellido;
    int telefono;

    cliente(String nom,String ape,int te)
   { 
    establecerNombre(nom);
    establecerApellido(ape);
    establecerTelefono(te);
   }

   public void establecerNombre(String nom)
   {
    nombre = nom;

   }
   public String obtenerNombre()
    {
        return nombre;
    }

    public void establecerApellido(String ape)
   {
    apellido = ape;

   }
   public String obtenerApellido()
    {
        return apellido;
    }

    public void establecerTelefono(int te)
    {
     telefono = te;
 
    }
    public int obtenerTelefono()
     {
         return telefono;
     }

    void compra()
    {
        System.out.println("realiza compras");
    }



    public static void main(String [] args){
        cliente cliente1 = new cliente("Bryan Fisher","Roajs Chavez",987653421);
        
       // cliente1.nombre = "Bryan Fisher";
        //cliente1.apellido = "Rojas Chavez";
        //cliente1.telefono = 987653421;

        System.out.println("El nombre del cliente es: "+cliente1.nombre);
        System.out.println("El apellido del cliente es:"+cliente1.apellido);
        System.out.println("El telefono del cliente es: "+cliente1.telefono);
        cliente1.compra();
    }
}
