package clase1;
public class centroComercial {
    String ubicacion;
    String accesibilidad;
    String buenS;
    String VariedadP;

    centroComercial(String ub,String acc,String bu,String va)
   { 
    establecerUbicacion(ub);
    establecerAccesibilidad(acc);
    establecerBuen(bu);
    establecerVariedadP(va);
   }
   public void establecerUbicacion(String ub)
   {
    ubicacion = ub;

   }
   public String obtenerUbicacion()
    {
        return ubicacion;
    }

    public void establecerAccesibilidad(String acc)
    {
     accesibilidad = acc;
 
    }
    public String obtenerAccesibilidad()
     {
         return accesibilidad;
     }

     public void establecerBuen(String bu)
   {
    buenS = bu;

   }
   public String obtenerBuen()
    {
        return buenS;
    }

    public void establecerVariedadP(String va)
   {
    VariedadP = va;

   }
   public String obtenerMTapa()
    {
        return VariedadP;
    }

    void vende()
    {
        System.out.println("vende todo tipo de productos");
    }

    public static void main(String [] args){
        centroComercial centroComercial1 = new centroComercial("Huanuco","A todo publico","Buen servicio","ofrece todo tipo de producto");
        
       // centroComercial1.ubicacion = "Huanuco";
        //centroComercial1.accesibilidad = "A todo publico";
        //centroComercial1.buenS = "ofrece un buen servicio";
        //centroComercial1.VariedadP = "ofrece todo tipo de productos";

        System.out.println("Se ubica en: "+centroComercial1.ubicacion);
        System.out.println("Nos: "+centroComercial1.accesibilidad);
        System.out.println("Nos: "+centroComercial1.buenS);
        System.out.println("Nos: "+centroComercial1.VariedadP);
        centroComercial1.vende();
    }
}
