package clase1;
public class celular {
    String almacenamiento;
    String bateria;
    String RP;
    String calidad;

    celular(String al,String bat,String R,String ca)
   { 
    establecerAlmaceamiento(al);
    establecerBateria(bat);
    establecerRP(R);
    establecerCalidad(ca);
   }
   public void establecerAlmaceamiento(String al)
   {
    almacenamiento = al;

   }
   public String obtenerAlmacenamiento()
    {
        return almacenamiento;
    }

    public void establecerBateria(String bat)
    {
     bateria = bat;
 
    }
    public String obtenerBateria()
     {
         return bateria;
     }

     public void establecerRP(String R)
   {
    RP = R;

   }
   public String obtenerRP()
    {
        return RP;
    }

    public void establecerCalidad(String ca)
   {
    calidad = ca;

   }
   public String obtenerMTapa()
    {
        return calidad;
    }


    void llamada()
    {
        System.out.println("ayuda a hacer llamadas telefonicas");
    }

    public static void main(String [] args){
        celular celular1 = new celular("21 GB","Caraga rapida","6 pulgadas","Buena");
        
        //celular1.almacenamiento = "21 GB ";
        //celular1.bateria = "carag rapida";
        //celular1.RP = "6 pulgadas";
        //celular1.calidad = "buena";

        System.out.println("la cantidad de almacenamiento es: "+celular1.almacenamiento);
        System.out.println("la bateria es de: "+celular1.bateria);
        System.out.println("La resolución de pantalla es de "+celular1.RP);
        System.out.println("L calidad de pantalla es de "+celular1.calidad);
        celular1.llamada();
    } 
}
